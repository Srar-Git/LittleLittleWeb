<script setup>
import {RouterLink , useRoute} from "vue-router";
import {ref, onMounted, getCurrentInstance, watch, onUpdated} from "vue"
import {useWindowsWidth} from "../../../assets/js/useWindowsWidth.js";
import MaterialInput from "../../../components/MaterialInput.vue";
import {getAllTypes} from "../../../api/index.js"
