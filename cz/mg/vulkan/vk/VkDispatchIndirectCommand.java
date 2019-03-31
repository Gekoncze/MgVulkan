package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDispatchIndirectCommand.html">khronos documentation</a>
 **/
public class VkDispatchIndirectCommand extends VkObject {
    public VkDispatchIndirectCommand() {
        super(sizeof());
    }

    public VkDispatchIndirectCommand(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDispatchIndirectCommand(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkDispatchIndirectCommand(VkUInt32 x, VkUInt32 y, VkUInt32 z) {
        super(sizeof());
        setX(x);
        setY(y);
        setZ(z);
    }

    public VkUInt32 getX() {
        return new VkUInt32(getVkMemory(), getX(getVkAddress()));
    }

    public void setX(VkUInt32 x) {
        setX(getVkAddress(), x.getVkAddress());
    }

    private static native long getX(long address);
    private static native void setX(long address, long x);

    public VkUInt32 getY() {
        return new VkUInt32(getVkMemory(), getY(getVkAddress()));
    }

    public void setY(VkUInt32 y) {
        setY(getVkAddress(), y.getVkAddress());
    }

    private static native long getY(long address);
    private static native void setY(long address, long y);

    public VkUInt32 getZ() {
        return new VkUInt32(getVkMemory(), getZ(getVkAddress()));
    }

    public void setZ(VkUInt32 z) {
        setZ(getVkAddress(), z.getVkAddress());
    }

    private static native long getZ(long address);
    private static native void setZ(long address, long z);


    public static native long sizeof();

    public static class Array extends VkDispatchIndirectCommand implements cz.mg.collections.array.ReadonlyArray<VkDispatchIndirectCommand> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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
        public VkDispatchIndirectCommand get(int i){
            return new VkDispatchIndirectCommand(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkDispatchIndirectCommand[] a) {
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
