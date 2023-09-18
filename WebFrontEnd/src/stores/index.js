import {createPinia, defineStore} from 'pinia';
import bootstrap from "bootstrap/dist/js/bootstrap.min.js";

const pinia = createPinia();

export const useAppStore = defineStore("storeId", {
    state: () => ({
        bootstrap,
    }),
});

export default pinia;