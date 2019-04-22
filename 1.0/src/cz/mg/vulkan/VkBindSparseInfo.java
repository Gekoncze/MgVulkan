package cz.mg.vulkan;

public class VkBindSparseInfo extends VkObject {
    public VkBindSparseInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO));
    }

    public VkBindSparseInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBindSparseInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
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

    public VkUInt32 getWaitSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getWaitSemaphoreCount(getVkAddress()));
    }

    
    public void setWaitSemaphoreCount(VkUInt32 waitSemaphoreCount) {
        setWaitSemaphoreCount(getVkAddress(), waitSemaphoreCount != null ? waitSemaphoreCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getWaitSemaphoreCountQ() {
        return getWaitSemaphoreCount().getValue();
    }

    public void setWaitSemaphoreCount(int waitSemaphoreCount) {
        getWaitSemaphoreCount().setValue(waitSemaphoreCount);
    }

    private static native long getWaitSemaphoreCount(long address);
    private static native void setWaitSemaphoreCount(long address, long waitSemaphoreCount);

    public VkSemaphore getPWaitSemaphores() {
        return new VkSemaphore(getVkMemory(), getPWaitSemaphores(getVkAddress()));
    }

    private VkObject pWaitSemaphores = null;
    public void setPWaitSemaphores(VkSemaphore pWaitSemaphores) {
        setPWaitSemaphores(getVkAddress(), pWaitSemaphores != null ? pWaitSemaphores.getVkAddress() : VkPointer.NULL);
        this.pWaitSemaphores = pWaitSemaphores;
    }

    private static native long getPWaitSemaphores(long address);
    private static native void setPWaitSemaphores(long address, long pWaitSemaphores);

    public VkUInt32 getBufferBindCount() {
        return new VkUInt32(getVkMemory(), getBufferBindCount(getVkAddress()));
    }

    
    public void setBufferBindCount(VkUInt32 bufferBindCount) {
        setBufferBindCount(getVkAddress(), bufferBindCount != null ? bufferBindCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getBufferBindCountQ() {
        return getBufferBindCount().getValue();
    }

    public void setBufferBindCount(int bufferBindCount) {
        getBufferBindCount().setValue(bufferBindCount);
    }

    private static native long getBufferBindCount(long address);
    private static native void setBufferBindCount(long address, long bufferBindCount);

    public VkSparseBufferMemoryBindInfo getPBufferBinds() {
        return new VkSparseBufferMemoryBindInfo(getVkMemory(), getPBufferBinds(getVkAddress()));
    }

    private VkObject pBufferBinds = null;
    public void setPBufferBinds(VkSparseBufferMemoryBindInfo pBufferBinds) {
        setPBufferBinds(getVkAddress(), pBufferBinds != null ? pBufferBinds.getVkAddress() : VkPointer.NULL);
        this.pBufferBinds = pBufferBinds;
    }

    private static native long getPBufferBinds(long address);
    private static native void setPBufferBinds(long address, long pBufferBinds);

    public VkUInt32 getImageOpaqueBindCount() {
        return new VkUInt32(getVkMemory(), getImageOpaqueBindCount(getVkAddress()));
    }

    
    public void setImageOpaqueBindCount(VkUInt32 imageOpaqueBindCount) {
        setImageOpaqueBindCount(getVkAddress(), imageOpaqueBindCount != null ? imageOpaqueBindCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getImageOpaqueBindCountQ() {
        return getImageOpaqueBindCount().getValue();
    }

    public void setImageOpaqueBindCount(int imageOpaqueBindCount) {
        getImageOpaqueBindCount().setValue(imageOpaqueBindCount);
    }

    private static native long getImageOpaqueBindCount(long address);
    private static native void setImageOpaqueBindCount(long address, long imageOpaqueBindCount);

    public VkSparseImageOpaqueMemoryBindInfo getPImageOpaqueBinds() {
        return new VkSparseImageOpaqueMemoryBindInfo(getVkMemory(), getPImageOpaqueBinds(getVkAddress()));
    }

    private VkObject pImageOpaqueBinds = null;
    public void setPImageOpaqueBinds(VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds) {
        setPImageOpaqueBinds(getVkAddress(), pImageOpaqueBinds != null ? pImageOpaqueBinds.getVkAddress() : VkPointer.NULL);
        this.pImageOpaqueBinds = pImageOpaqueBinds;
    }

    private static native long getPImageOpaqueBinds(long address);
    private static native void setPImageOpaqueBinds(long address, long pImageOpaqueBinds);

    public VkUInt32 getImageBindCount() {
        return new VkUInt32(getVkMemory(), getImageBindCount(getVkAddress()));
    }

    
    public void setImageBindCount(VkUInt32 imageBindCount) {
        setImageBindCount(getVkAddress(), imageBindCount != null ? imageBindCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getImageBindCountQ() {
        return getImageBindCount().getValue();
    }

    public void setImageBindCount(int imageBindCount) {
        getImageBindCount().setValue(imageBindCount);
    }

    private static native long getImageBindCount(long address);
    private static native void setImageBindCount(long address, long imageBindCount);

    public VkSparseImageMemoryBindInfo getPImageBinds() {
        return new VkSparseImageMemoryBindInfo(getVkMemory(), getPImageBinds(getVkAddress()));
    }

    private VkObject pImageBinds = null;
    public void setPImageBinds(VkSparseImageMemoryBindInfo pImageBinds) {
        setPImageBinds(getVkAddress(), pImageBinds != null ? pImageBinds.getVkAddress() : VkPointer.NULL);
        this.pImageBinds = pImageBinds;
    }

    private static native long getPImageBinds(long address);
    private static native void setPImageBinds(long address, long pImageBinds);

    public VkUInt32 getSignalSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getSignalSemaphoreCount(getVkAddress()));
    }

    
    public void setSignalSemaphoreCount(VkUInt32 signalSemaphoreCount) {
        setSignalSemaphoreCount(getVkAddress(), signalSemaphoreCount != null ? signalSemaphoreCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSignalSemaphoreCountQ() {
        return getSignalSemaphoreCount().getValue();
    }

    public void setSignalSemaphoreCount(int signalSemaphoreCount) {
        getSignalSemaphoreCount().setValue(signalSemaphoreCount);
    }

    private static native long getSignalSemaphoreCount(long address);
    private static native void setSignalSemaphoreCount(long address, long signalSemaphoreCount);

    public VkSemaphore getPSignalSemaphores() {
        return new VkSemaphore(getVkMemory(), getPSignalSemaphores(getVkAddress()));
    }

    private VkObject pSignalSemaphores = null;
    public void setPSignalSemaphores(VkSemaphore pSignalSemaphores) {
        setPSignalSemaphores(getVkAddress(), pSignalSemaphores != null ? pSignalSemaphores.getVkAddress() : VkPointer.NULL);
        this.pSignalSemaphores = pSignalSemaphores;
    }

    private static native long getPSignalSemaphores(long address);
    private static native void setPSignalSemaphores(long address, long pSignalSemaphores);


    public static native long sizeof();

    public static class Array extends VkBindSparseInfo implements cz.mg.collections.array.ReadonlyArray<VkBindSparseInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindSparseInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO));;
        }

        public Array(int count, VkBindSparseInfo o){
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
        public VkBindSparseInfo get(int i){
            return new VkBindSparseInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBindSparseInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBindSparseInfo.Pointer> {
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

            public Array(VkBindSparseInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBindSparseInfo.Pointer get(int i){
                return new VkBindSparseInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
