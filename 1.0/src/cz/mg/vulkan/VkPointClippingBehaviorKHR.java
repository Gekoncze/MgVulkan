package cz.mg.vulkan;

public class VkPointClippingBehaviorKHR extends VkEnum {
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR = 0;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR = 1;

    public VkPointClippingBehaviorKHR() {
    }

    public VkPointClippingBehaviorKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPointClippingBehaviorKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPointClippingBehaviorKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR) return "VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR) return "VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkPointClippingBehaviorKHR implements cz.mg.collections.array.ReadonlyArray<VkPointClippingBehaviorKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPointClippingBehaviorKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPointClippingBehaviorKHR o){
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
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i]);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPointClippingBehaviorKHR get(int i){
            return new VkPointClippingBehaviorKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
