package cz.mg.vulkan;

public class VkPipelineBindPoint extends VkEnum {
    public static final int VK_PIPELINE_BIND_POINT_GRAPHICS = 0;
    public static final int VK_PIPELINE_BIND_POINT_COMPUTE = 1;

    public VkPipelineBindPoint() {
    }

    protected VkPipelineBindPoint(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPipelineBindPoint(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineBindPoint(int value) {
        setValue(value);
    }

    public VkPipelineBindPoint(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_PIPELINE_BIND_POINT_GRAPHICS) return "VK_PIPELINE_BIND_POINT_GRAPHICS";
        if(getValue() == VK_PIPELINE_BIND_POINT_COMPUTE) return "VK_PIPELINE_BIND_POINT_COMPUTE";
        return "UNKNOWN";
    }

    public static class Array extends VkPipelineBindPoint implements cz.mg.collections.array.ReadonlyArray<VkPipelineBindPoint> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineBindPoint.sizeof()));
            this.count = count;
        }

        public Array(VkPipelineBindPoint o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public int getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, int value){
            setValueNative(address(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPipelineBindPoint get(int i){
            return new VkPipelineBindPoint(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
