package cz.mg.vulkan;

public class VkResult extends VkEnum {
    public static final int VK_SUCCESS = 0;
    public static final int VK_NOT_READY = 1;
    public static final int VK_TIMEOUT = 2;
    public static final int VK_EVENT_SET = 3;
    public static final int VK_EVENT_RESET = 4;
    public static final int VK_INCOMPLETE = 5;
    public static final int VK_ERROR_OUT_OF_HOST_MEMORY = -1;
    public static final int VK_ERROR_OUT_OF_DEVICE_MEMORY = -2;
    public static final int VK_ERROR_INITIALIZATION_FAILED = -3;
    public static final int VK_ERROR_DEVICE_LOST = -4;
    public static final int VK_ERROR_MEMORY_MAP_FAILED = -5;
    public static final int VK_ERROR_LAYER_NOT_PRESENT = -6;
    public static final int VK_ERROR_EXTENSION_NOT_PRESENT = -7;
    public static final int VK_ERROR_FEATURE_NOT_PRESENT = -8;
    public static final int VK_ERROR_INCOMPATIBLE_DRIVER = -9;
    public static final int VK_ERROR_TOO_MANY_OBJECTS = -10;
    public static final int VK_ERROR_FORMAT_NOT_SUPPORTED = -11;
    public static final int VK_ERROR_FRAGMENTED_POOL = -12;
    public static final int VK_ERROR_SURFACE_LOST_KHR = -1000000000;
    public static final int VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;
    public static final int VK_SUBOPTIMAL_KHR = 1000001003;
    public static final int VK_ERROR_OUT_OF_DATE_KHR = -1000001004;
    public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;
    public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;
    public static final int VK_ERROR_INVALID_SHADER_NV = -1000012000;
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY_KHR = -1000069000;
    public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR = -1000072003;

    public VkResult() {
    }

    public VkResult(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkResult(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkResult(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SUCCESS) return "VK_SUCCESS";
        if(getValue() == VK_NOT_READY) return "VK_NOT_READY";
        if(getValue() == VK_TIMEOUT) return "VK_TIMEOUT";
        if(getValue() == VK_EVENT_SET) return "VK_EVENT_SET";
        if(getValue() == VK_EVENT_RESET) return "VK_EVENT_RESET";
        if(getValue() == VK_INCOMPLETE) return "VK_INCOMPLETE";
        if(getValue() == VK_ERROR_OUT_OF_HOST_MEMORY) return "VK_ERROR_OUT_OF_HOST_MEMORY";
        if(getValue() == VK_ERROR_OUT_OF_DEVICE_MEMORY) return "VK_ERROR_OUT_OF_DEVICE_MEMORY";
        if(getValue() == VK_ERROR_INITIALIZATION_FAILED) return "VK_ERROR_INITIALIZATION_FAILED";
        if(getValue() == VK_ERROR_DEVICE_LOST) return "VK_ERROR_DEVICE_LOST";
        if(getValue() == VK_ERROR_MEMORY_MAP_FAILED) return "VK_ERROR_MEMORY_MAP_FAILED";
        if(getValue() == VK_ERROR_LAYER_NOT_PRESENT) return "VK_ERROR_LAYER_NOT_PRESENT";
        if(getValue() == VK_ERROR_EXTENSION_NOT_PRESENT) return "VK_ERROR_EXTENSION_NOT_PRESENT";
        if(getValue() == VK_ERROR_FEATURE_NOT_PRESENT) return "VK_ERROR_FEATURE_NOT_PRESENT";
        if(getValue() == VK_ERROR_INCOMPATIBLE_DRIVER) return "VK_ERROR_INCOMPATIBLE_DRIVER";
        if(getValue() == VK_ERROR_TOO_MANY_OBJECTS) return "VK_ERROR_TOO_MANY_OBJECTS";
        if(getValue() == VK_ERROR_FORMAT_NOT_SUPPORTED) return "VK_ERROR_FORMAT_NOT_SUPPORTED";
        if(getValue() == VK_ERROR_FRAGMENTED_POOL) return "VK_ERROR_FRAGMENTED_POOL";
        if(getValue() == VK_ERROR_SURFACE_LOST_KHR) return "VK_ERROR_SURFACE_LOST_KHR";
        if(getValue() == VK_ERROR_NATIVE_WINDOW_IN_USE_KHR) return "VK_ERROR_NATIVE_WINDOW_IN_USE_KHR";
        if(getValue() == VK_SUBOPTIMAL_KHR) return "VK_SUBOPTIMAL_KHR";
        if(getValue() == VK_ERROR_OUT_OF_DATE_KHR) return "VK_ERROR_OUT_OF_DATE_KHR";
        if(getValue() == VK_ERROR_INCOMPATIBLE_DISPLAY_KHR) return "VK_ERROR_INCOMPATIBLE_DISPLAY_KHR";
        if(getValue() == VK_ERROR_VALIDATION_FAILED_EXT) return "VK_ERROR_VALIDATION_FAILED_EXT";
        if(getValue() == VK_ERROR_INVALID_SHADER_NV) return "VK_ERROR_INVALID_SHADER_NV";
        if(getValue() == VK_ERROR_OUT_OF_POOL_MEMORY_KHR) return "VK_ERROR_OUT_OF_POOL_MEMORY_KHR";
        if(getValue() == VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR) return "VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkResult implements cz.mg.collections.array.ReadonlyArray<VkResult> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkResult.sizeof()));
            this.count = count;
        }

        public Array(int count, VkResult o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkResult get(int i){
            return new VkResult(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
