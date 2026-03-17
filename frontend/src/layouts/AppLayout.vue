<template>
  <div class="app-shell">
    <aside class="sidebar">
      <h1>Dental Admin</h1>
      <nav>
        <RouterLink to="/">仪表盘</RouterLink>
        <RouterLink to="/patients">患者管理</RouterLink>
        <RouterLink to="/appointments">预约管理</RouterLink>
        <RouterLink to="/medical-records">病历管理</RouterLink>
        <RouterLink to="/billings">收费管理</RouterLink>
        <RouterLink to="/users">用户管理</RouterLink>
      </nav>
    </aside>
    <main class="content">
      <RouterView />
    </main>
  </div>
</template>

<script setup lang="ts">
</script>
