package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayModeCreateFlagsKHR.html">khronos documentation</a>
 **/
public class VkDisplayModeCreateFlagsKHR extends VkFlags {
    public VkDisplayModeCreateFlagsKHR() {
    }

    public VkDisplayModeCreateFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayModeCreateFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayModeCreateFlagsKHR(int value) {
        setValue(value);
    }

    public static class Array extends VkDisplayModeCreateFlagsKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeCreateFlagsKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayModeCreateFlagsKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayModeCreateFlagsKHR o){
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
        public VkDisplayModeCreateFlagsKHR get(int i){
            return new VkDisplayModeCreateFlagsKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayModeCreateFlagsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayModeCreateFlagsKHR.Pointer> {
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

            public Array(VkDisplayModeCreateFlagsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayModeCreateFlagsKHR.Pointer get(int i){
                return new VkDisplayModeCreateFlagsKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
