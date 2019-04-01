package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFrontFace.html">khronos documentation</a>
 **/
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

    public static class Array extends VkFrontFace implements cz.mg.collections.array.ReadonlyArray<VkFrontFace> {
        private final int count;

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

        public static class Array extends VkFrontFace.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkFrontFace[] a) {
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
