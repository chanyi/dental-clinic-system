import { createRouter, createWebHistory } from "vue-router";
import AppLayout from "../layouts/AppLayout.vue";
import DashboardView from "../views/DashboardView.vue";
import LoginView from "../views/LoginView.vue";
import PatientView from "../views/PatientView.vue";
import AppointmentView from "../views/AppointmentView.vue";
import MedicalRecordView from "../views/MedicalRecordView.vue";
import BillingView from "../views/BillingView.vue";
import UserView from "../views/UserView.vue";

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: "/login",
      name: "login",
      component: LoginView
    },
    {
      path: "/",
      component: AppLayout,
      children: [
        { path: "", name: "dashboard", component: DashboardView },
        { path: "patients", name: "patients", component: PatientView },
        { path: "appointments", name: "appointments", component: AppointmentView },
        { path: "medical-records", name: "medical-records", component: MedicalRecordView },
        { path: "billings", name: "billings", component: BillingView },
        { path: "users", name: "users", component: UserView }
      ]
    }
  ]
});

export default router;
