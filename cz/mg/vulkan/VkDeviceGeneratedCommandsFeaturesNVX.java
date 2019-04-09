package cz.mg.vulkan;

public class VkDeviceGeneratedCommandsFeaturesNVX extends VkObject {
    public VkDeviceGeneratedCommandsFeaturesNVX() {
        super(sizeof());
    }

    public VkDeviceGeneratedCommandsFeaturesNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGeneratedCommandsFeaturesNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceGeneratedCommandsFeaturesNVX(VkStructureType sType, VkObject pNext, VkBool32 computeBindingPointSupport) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setComputeBindingPointSupport(computeBindingPointSupport);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkBool32 getComputeBindingPointSupport() {
        return new VkBool32(getVkMemory(), getComputeBindingPointSupport(getVkAddress()));
    }

    
    public void setComputeBindingPointSupport(VkBool32 computeBindingPointSupport) {
        setComputeBindingPointSupport(getVkAddress(), computeBindingPointSupport != null ? computeBindingPointSupport.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getComputeBindingPointSupport(long address);
    private static native void setComputeBindingPointSupport(long address, long computeBindingPointSupport);


    public static native long sizeof();

    public static class Array extends VkDeviceGeneratedCommandsFeaturesNVX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGeneratedCommandsFeaturesNVX> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGeneratedCommandsFeaturesNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceGeneratedCommandsFeaturesNVX o){
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
        public VkDeviceGeneratedCommandsFeaturesNVX get(int i){
            return new VkDeviceGeneratedCommandsFeaturesNVX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkDeviceGeneratedCommandsFeaturesNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGeneratedCommandsFeaturesNVX.Pointer> {
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

            public Array(VkDeviceGeneratedCommandsFeaturesNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGeneratedCommandsFeaturesNVX.Pointer get(int i){
                return new VkDeviceGeneratedCommandsFeaturesNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
