package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineRasterizationStateRasterizationOrderAMD.html">khronos documentation</a>
 **/
public class VkPipelineRasterizationStateRasterizationOrderAMD extends VkObject {
    public VkPipelineRasterizationStateRasterizationOrderAMD() {
        super(sizeof());
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPipelineRasterizationStateRasterizationOrderAMD(VkStructureType sType, VkObject pNext, VkRasterizationOrderAMD rasterizationOrder) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setRasterizationOrder(rasterizationOrder);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkRasterizationOrderAMD getRasterizationOrder() {
        return new VkRasterizationOrderAMD(getVkMemory(), getRasterizationOrder(getVkAddress()));
    }

    public void setRasterizationOrder(VkRasterizationOrderAMD rasterizationOrder) {
        setRasterizationOrder(getVkAddress(), rasterizationOrder.getVkAddress());
    }

    private static native long getRasterizationOrder(long address);
    private static native void setRasterizationOrder(long address, long rasterizationOrder);


    public static native long sizeof();

    public static class Array extends VkPipelineRasterizationStateRasterizationOrderAMD implements cz.mg.collections.array.ReadonlyArray<VkPipelineRasterizationStateRasterizationOrderAMD> {
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
        public VkPipelineRasterizationStateRasterizationOrderAMD get(int i){
            return new VkPipelineRasterizationStateRasterizationOrderAMD(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPipelineRasterizationStateRasterizationOrderAMD[] a) {
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
