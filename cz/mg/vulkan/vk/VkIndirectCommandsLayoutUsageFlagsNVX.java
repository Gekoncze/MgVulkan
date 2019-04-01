package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutUsageFlagsNVX.html">khronos documentation</a>
 **/
public class VkIndirectCommandsLayoutUsageFlagsNVX extends VkFlags {
    public VkIndirectCommandsLayoutUsageFlagsNVX() {
    }

    public VkIndirectCommandsLayoutUsageFlagsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndirectCommandsLayoutUsageFlagsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkIndirectCommandsLayoutUsageFlagsNVX(int value) {
        setValue(value);
    }

    public static class Array extends VkIndirectCommandsLayoutUsageFlagsNVX implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsLayoutUsageFlagsNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndirectCommandsLayoutUsageFlagsNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkIndirectCommandsLayoutUsageFlagsNVX o){
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
        public VkIndirectCommandsLayoutUsageFlagsNVX get(int i){
            return new VkIndirectCommandsLayoutUsageFlagsNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkIndirectCommandsLayoutUsageFlagsNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkIndirectCommandsLayoutUsageFlagsNVX[] a) {
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
