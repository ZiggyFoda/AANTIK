<template>
  <div class="col-md-12">
    <div class="card card-container">
      <img id="profile-img" src="../assets/puj.png" class="profile-img-card" />
      <form name="form" @submit.prevent="handleLogin">
        <div class="form-group">
          <label for="username">Username</label>
          <input
            v-model="user.username"
            v-validate="'required'"
            type="text"
            class="form-control"
            name="username"
          />
          <div
            v-if="errors.has('username')"
            class="alert alert-danger"
            role="alert"
          >Username is required!</div>
        </div>
        <div class="form-group">
          <label for="password">Password</label>
          <input
            v-model="user.password"
            v-validate="'required'"
            type="password"
            class="form-control"
            name="password"
          />
          <div
            v-if="errors.has('password')"
            class="alert alert-danger"
            role="alert"
          >Password is required!</div>
        </div>
        <div class="form-group">
          <button class="btn btn-primary btn-block" :disabled="loading" margin="10px">
            <span v-show="loading" class="spinner-border spinner-border-sm"></span>
            <span>Login</span>
          </button>
        </div>
        <div class="form-group">
          <div v-if="message" class="alert alert-danger" role="alert">{{message}}</div>
        </div>
      </form>
    </div>
  </div>
</template>
<script>
import User from "@/components/user";
export default {
  name: 'Login',
  data() {
    return {
      user: new User('', ''),
      loading: false,
      message: ''
    };
  },computed: {
    loggedIn() {
      return this.$store.state.auth.status.loggedIn;
    }
  },
  created() {
   /* if (this.loggedIn) {
      this.$router.push('/foro');
      this.$store.dispatch(logout);
    }*/
  },
  methods: {
    handleLogin() {
      this.loading = true;
      this.$validator.validateAll().then(isValid => {
        if (!isValid) {
          this.loading = false;
          return;
        }
        console.log(this.user.username)
        if (this.user.username && this.user.password) {
          this.$store.dispatch('auth/login', this.user).then(
            (data) => {  
              if(data.roles == "ROLE_STUDIANTE" ){
              this.$router.push('/studentHome');}
              if(data.roles == "ROLE_ADMIN" ){
              this.$router.push('/adminHome');}
              if(data.roles == "ROLE_ORGANIZACION" ){
              this.$router.push('/orgSocHome');}
              if(data.roles == "ROLE_EMP" ){
              this.$router.push('/HomeEmp');}
              if(data.roles == "ROLE_COORDINADOR" ){
              this.$router.push('/CoordHome');}
              if(data.roles == "ROLE_DOCENTE" ){
              this.$router.push('/HomeDoc');}
              if(data.roles == "ROLE_PREINSCRITO" ){
              this.$router.push('/preinscHome');}
            },
            error => {
              this.loading = false;
              this.message =
                (error.response && error.response.data) ||
                error.message ||
                error.toString();
            }
          );
        }
      });
    }
  }
};
</script>
<style scoped>
label {
  display: block;
  margin-top: 10px;
}
.card-container.card {
  max-width: 350px !important;
  padding: 40px 40px;
}
.card {
  background-color: #f7f7f7;
  padding: 20px 25px 30px;
  margin-left: auto;
  margin-right: auto;
  margin-bottom: 10px;
  align-content: center;
  margin-top: 50px;
  -moz-border-radius: 2px;
  -webkit-border-radius: 2px;
  -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
  -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
  box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
  border-radius: 25px;
  text-align: left;
}
.profile-img-card {
  width: 200px;
  height: 200px;
  margin: 0 auto 20px;
  display: inside;
  object-fit: scale-down;
  -moz-border-radius: 60%;
  -webkit-border-radius: 80%;
  border-radius: 80%;
}
</style>