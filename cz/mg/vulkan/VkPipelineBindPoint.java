package cz.mg.vulkan;

public class VkPipelineBindPoint extends VkEnum {
    public static final int VK_PIPELINE_BIND_POINT_GRAPHICS = 0;
    public static final int VK_PIPELINE_BIND_POINT_COMPUTE = 1;

    public VkPipelineBindPoint() {
    }

    public VkPipelineBindPoint(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineBindPoint(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineBindPoint(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_PIPELINE_BIND_POINT_GRAPHICS) return "VK_PIPELINE_BIND_POINT_GRAPHICS";
        if(getValue() == VK_PIPELINE_BIND_POINT_COMPUTE) return "VK_PIPELINE_BIND_POINT_COMPUTE";
        return "UNKNOWN";
    }

    public static class Array extends VkPipelineBindPoint implements cz.mg.collections.array.ReadonlyArray<VkPipelineBindPoint> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineBindPoint.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineBindPoint o){
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

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPipelineBindPoint get(int i){
            return new VkPipelineBindPoint(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
