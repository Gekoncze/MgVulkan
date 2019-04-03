package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceCounterFlagBitsEXT.html">khronos documentation</a>
 **/
public class VkSurfaceCounterFlagBitsEXT extends VkFlagBits {
    public static final int VK_SURFACE_COUNTER_VBLANK_EXT = 0x00000001;

    public VkSurfaceCounterFlagBitsEXT() {
    }

    public VkSurfaceCounterFlagBitsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceCounterFlagBitsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSurfaceCounterFlagBitsEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SURFACE_COUNTER_VBLANK_EXT) s += "VK_SURFACE_COUNTER_VBLANK_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkSurfaceCounterFlagBitsEXT implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCounterFlagBitsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceCounterFlagBitsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSurfaceCounterFlagBitsEXT o){
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
        public VkSurfaceCounterFlagBitsEXT get(int i){
            return new VkSurfaceCounterFlagBitsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSurfaceCounterFlagBitsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkSurfaceCounterFlagBitsEXT[] a) {
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
