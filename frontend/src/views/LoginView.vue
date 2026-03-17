<template>
  <section class="login-page">
    <div class="login-card">
      <h2>牙医管理系统登录</h2>
      <p>当前为测试骨架，登录接口为占位实现。</p>
      <button type="button" @click="handleLogin">调用占位登录接口</button>
      <p v-if="message">{{ message }}</p>
    </div>
  </section>
</template>

<script setup lang="ts">
import { ref } from "vue";
import { login } from "../api/auth";

const message = ref("");

async function handleLogin() {
  try {
    const result = await login();
    message.value = result.message ?? "登录占位接口调用成功";
  } catch (error) {
    message.value = "后端暂未启动或接口不可用";
  }
}
</script>
