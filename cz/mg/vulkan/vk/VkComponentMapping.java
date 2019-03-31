package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkComponentMapping.html">khronos documentation</a>
 **/
public class VkComponentMapping extends VkObject {
    public VkComponentMapping() {
        super(sizeof());
    }

    public VkComponentMapping(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkComponentMapping(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkComponentMapping(VkComponentSwizzle r, VkComponentSwizzle g, VkComponentSwizzle b, VkComponentSwizzle a) {
        super(sizeof());
        setR(r);
        setG(g);
        setB(b);
        setA(a);
    }

    public VkComponentSwizzle getR() {
        return new VkComponentSwizzle(getVkMemory(), getR(getVkAddress()));
    }

    public void setR(VkComponentSwizzle r) {
        setR(getVkAddress(), r.getVkAddress());
    }

    private static native long getR(long address);
    private static native void setR(long address, long r);

    public VkComponentSwizzle getG() {
        return new VkComponentSwizzle(getVkMemory(), getG(getVkAddress()));
    }

    public void setG(VkComponentSwizzle g) {
        setG(getVkAddress(), g.getVkAddress());
    }

    private static native long getG(long address);
    private static native void setG(long address, long g);

    public VkComponentSwizzle getB() {
        return new VkComponentSwizzle(getVkMemory(), getB(getVkAddress()));
    }

    public void setB(VkComponentSwizzle b) {
        setB(getVkAddress(), b.getVkAddress());
    }

    private static native long getB(long address);
    private static native void setB(long address, long b);

    public VkComponentSwizzle getA() {
        return new VkComponentSwizzle(getVkMemory(), getA(getVkAddress()));
    }

    public void setA(VkComponentSwizzle a) {
        setA(getVkAddress(), a.getVkAddress());
    }

    private static native long getA(long address);
    private static native void setA(long address, long a);


    public static native long sizeof();

    public static class Array extends VkComponentMapping implements cz.mg.collections.array.ReadonlyArray<VkComponentMapping> {
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
        public VkComponentMapping get(int i){
            return new VkComponentMapping(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkComponentMapping[] a) {
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
