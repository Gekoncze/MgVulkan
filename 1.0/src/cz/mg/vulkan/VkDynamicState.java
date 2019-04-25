package cz.mg.vulkan;

public class VkDynamicState extends VkEnum {
    public static final int VK_DYNAMIC_STATE_VIEWPORT = 0;
    public static final int VK_DYNAMIC_STATE_SCISSOR = 1;
    public static final int VK_DYNAMIC_STATE_LINE_WIDTH = 2;
    public static final int VK_DYNAMIC_STATE_DEPTH_BIAS = 3;
    public static final int VK_DYNAMIC_STATE_BLEND_CONSTANTS = 4;
    public static final int VK_DYNAMIC_STATE_DEPTH_BOUNDS = 5;
    public static final int VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6;
    public static final int VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = 7;
    public static final int VK_DYNAMIC_STATE_STENCIL_REFERENCE = 8;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV = 1000087000;
    public static final int VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT = 1000099000;
    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT = 1000143000;

    public VkDynamicState() {
    }

    public VkDynamicState(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDynamicState(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDynamicState(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_DYNAMIC_STATE_VIEWPORT) return "VK_DYNAMIC_STATE_VIEWPORT";
        if(getValue() == VK_DYNAMIC_STATE_SCISSOR) return "VK_DYNAMIC_STATE_SCISSOR";
        if(getValue() == VK_DYNAMIC_STATE_LINE_WIDTH) return "VK_DYNAMIC_STATE_LINE_WIDTH";
        if(getValue() == VK_DYNAMIC_STATE_DEPTH_BIAS) return "VK_DYNAMIC_STATE_DEPTH_BIAS";
        if(getValue() == VK_DYNAMIC_STATE_BLEND_CONSTANTS) return "VK_DYNAMIC_STATE_BLEND_CONSTANTS";
        if(getValue() == VK_DYNAMIC_STATE_DEPTH_BOUNDS) return "VK_DYNAMIC_STATE_DEPTH_BOUNDS";
        if(getValue() == VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK) return "VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK";
        if(getValue() == VK_DYNAMIC_STATE_STENCIL_WRITE_MASK) return "VK_DYNAMIC_STATE_STENCIL_WRITE_MASK";
        if(getValue() == VK_DYNAMIC_STATE_STENCIL_REFERENCE) return "VK_DYNAMIC_STATE_STENCIL_REFERENCE";
        if(getValue() == VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV) return "VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV";
        if(getValue() == VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT) return "VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT";
        if(getValue() == VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT) return "VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VkDynamicState implements cz.mg.collections.array.ReadonlyArray<VkDynamicState> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDynamicState.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDynamicState o){
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
        public VkDynamicState get(int i){
            return new VkDynamicState(getVkMemory(), addressAt(i));
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
