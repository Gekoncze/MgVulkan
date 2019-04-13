package cz.mg.vulkan;

public class VkImageType extends VkEnum {
    public static final int VK_IMAGE_TYPE_1D = 0;
    public static final int VK_IMAGE_TYPE_2D = 1;
    public static final int VK_IMAGE_TYPE_3D = 2;

    public VkImageType() {
    }

    public VkImageType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_IMAGE_TYPE_1D) return "VK_IMAGE_TYPE_1D";
        if(getValue() == VK_IMAGE_TYPE_2D) return "VK_IMAGE_TYPE_2D";
        if(getValue() == VK_IMAGE_TYPE_3D) return "VK_IMAGE_TYPE_3D";
        return "UNKNOWN";
    }

    public static class Array extends VkImageType implements cz.mg.collections.array.ReadonlyArray<VkImageType> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageType.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageType o){
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
        public VkImageType get(int i){
            return new VkImageType(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
