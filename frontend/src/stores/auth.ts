import { defineStore } from "pinia";

export const useAuthStore = defineStore("auth", {
  state: () => ({
    token: "",
    userName: "Demo Dentist"
  }),
  actions: {
    setToken(token: string) {
      this.token = token;
    },
    clearSession() {
      this.token = "";
    }
  }
});
