package cz.mg.vulkan;

public class VkFrontFace extends VkEnum {
    public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;
    public static final int VK_FRONT_FACE_CLOCKWISE = 1;

    public VkFrontFace() {
    }

    public VkFrontFace(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFrontFace(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFrontFace(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_FRONT_FACE_COUNTER_CLOCKWISE) return "VK_FRONT_FACE_COUNTER_CLOCKWISE";
        if(getValue() == VK_FRONT_FACE_CLOCKWISE) return "VK_FRONT_FACE_CLOCKWISE";
        return "UNKNOWN";
    }

    public static class Array extends VkFrontFace implements cz.mg.collections.array.ReadonlyArray<VkFrontFace> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFrontFace.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFrontFace o){
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
        public VkFrontFace get(int i){
            return new VkFrontFace(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
