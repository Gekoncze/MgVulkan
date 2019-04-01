package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPointClippingBehavior.html">khronos documentation</a>
 **/
public class VkPointClippingBehavior extends VkEnum {
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES = 0;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = 1;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR = VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR = VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY;

    public VkPointClippingBehavior() {
    }

    public VkPointClippingBehavior(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPointClippingBehavior(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPointClippingBehavior(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES) return "VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY) return "VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR) return "VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR";
        if(getValue() == VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR) return "VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VkPointClippingBehavior implements cz.mg.collections.array.ReadonlyArray<VkPointClippingBehavior> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPointClippingBehavior.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPointClippingBehavior o){
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
        public VkPointClippingBehavior get(int i){
            return new VkPointClippingBehavior(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkPointClippingBehavior.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkPointClippingBehavior[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
