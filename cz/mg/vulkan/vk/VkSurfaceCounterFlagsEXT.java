package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceCounterFlagsEXT.html">khronos documentation</a>
 **/
public class VkSurfaceCounterFlagsEXT extends VkFlags {
    public VkSurfaceCounterFlagsEXT() {
    }

    public VkSurfaceCounterFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSurfaceCounterFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSurfaceCounterFlagsEXT(int value) {
        setValue(value);
    }

    public static class Array extends VkSurfaceCounterFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCounterFlagsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceCounterFlagsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSurfaceCounterFlagsEXT o){
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
        public VkSurfaceCounterFlagsEXT get(int i){
            return new VkSurfaceCounterFlagsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSurfaceCounterFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSurfaceCounterFlagsEXT.Pointer> {
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

            public Array(VkSurfaceCounterFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSurfaceCounterFlagsEXT.Pointer get(int i){
                return new VkSurfaceCounterFlagsEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
