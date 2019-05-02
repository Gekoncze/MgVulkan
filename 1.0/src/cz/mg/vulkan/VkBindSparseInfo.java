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

    public VkBindSparseInfo(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkUInt32 getWaitSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getWaitSemaphoreCountNative(getVkAddress()));
    }

    
    public void setWaitSemaphoreCount(VkUInt32 waitSemaphoreCount) {
        setWaitSemaphoreCountNative(getVkAddress(), waitSemaphoreCount != null ? waitSemaphoreCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWaitSemaphoreCountQ() {
        return getWaitSemaphoreCount().getValue();
    }

    public void setWaitSemaphoreCount(int waitSemaphoreCount) {
        getWaitSemaphoreCount().setValue(waitSemaphoreCount);
    }

    protected static native long getWaitSemaphoreCountNative(long address);
    protected static native void setWaitSemaphoreCountNative(long address, long waitSemaphoreCount);

    public VkSemaphore getPWaitSemaphores() {
        return new VkSemaphore(getVkMemory(), getPWaitSemaphoresNative(getVkAddress()));
    }

    private VkObject pWaitSemaphores = null;
    public void setPWaitSemaphores(VkSemaphore pWaitSemaphores) {
        setPWaitSemaphoresNative(getVkAddress(), pWaitSemaphores != null ? pWaitSemaphores.getVkAddress() : VkPointer.NULL);
        this.pWaitSemaphores = pWaitSemaphores;
    }

    protected static native long getPWaitSemaphoresNative(long address);
    protected static native void setPWaitSemaphoresNative(long address, long pWaitSemaphores);

    public VkUInt32 getBufferBindCount() {
        return new VkUInt32(getVkMemory(), getBufferBindCountNative(getVkAddress()));
    }

    
    public void setBufferBindCount(VkUInt32 bufferBindCount) {
        setBufferBindCountNative(getVkAddress(), bufferBindCount != null ? bufferBindCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBufferBindCountQ() {
        return getBufferBindCount().getValue();
    }

    public void setBufferBindCount(int bufferBindCount) {
        getBufferBindCount().setValue(bufferBindCount);
    }

    protected static native long getBufferBindCountNative(long address);
    protected static native void setBufferBindCountNative(long address, long bufferBindCount);

    public VkSparseBufferMemoryBindInfo getPBufferBinds() {
        return new VkSparseBufferMemoryBindInfo(getVkMemory(), getPBufferBindsNative(getVkAddress()));
    }

    private VkObject pBufferBinds = null;
    public void setPBufferBinds(VkSparseBufferMemoryBindInfo pBufferBinds) {
        setPBufferBindsNative(getVkAddress(), pBufferBinds != null ? pBufferBinds.getVkAddress() : VkPointer.NULL);
        this.pBufferBinds = pBufferBinds;
    }

    protected static native long getPBufferBindsNative(long address);
    protected static native void setPBufferBindsNative(long address, long pBufferBinds);

    public VkUInt32 getImageOpaqueBindCount() {
        return new VkUInt32(getVkMemory(), getImageOpaqueBindCountNative(getVkAddress()));
    }

    
    public void setImageOpaqueBindCount(VkUInt32 imageOpaqueBindCount) {
        setImageOpaqueBindCountNative(getVkAddress(), imageOpaqueBindCount != null ? imageOpaqueBindCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageOpaqueBindCountQ() {
        return getImageOpaqueBindCount().getValue();
    }

    public void setImageOpaqueBindCount(int imageOpaqueBindCount) {
        getImageOpaqueBindCount().setValue(imageOpaqueBindCount);
    }

    protected static native long getImageOpaqueBindCountNative(long address);
    protected static native void setImageOpaqueBindCountNative(long address, long imageOpaqueBindCount);

    public VkSparseImageOpaqueMemoryBindInfo getPImageOpaqueBinds() {
        return new VkSparseImageOpaqueMemoryBindInfo(getVkMemory(), getPImageOpaqueBindsNative(getVkAddress()));
    }

    private VkObject pImageOpaqueBinds = null;
    public void setPImageOpaqueBinds(VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds) {
        setPImageOpaqueBindsNative(getVkAddress(), pImageOpaqueBinds != null ? pImageOpaqueBinds.getVkAddress() : VkPointer.NULL);
        this.pImageOpaqueBinds = pImageOpaqueBinds;
    }

    protected static native long getPImageOpaqueBindsNative(long address);
    protected static native void setPImageOpaqueBindsNative(long address, long pImageOpaqueBinds);

    public VkUInt32 getImageBindCount() {
        return new VkUInt32(getVkMemory(), getImageBindCountNative(getVkAddress()));
    }

    
    public void setImageBindCount(VkUInt32 imageBindCount) {
        setImageBindCountNative(getVkAddress(), imageBindCount != null ? imageBindCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageBindCountQ() {
        return getImageBindCount().getValue();
    }

    public void setImageBindCount(int imageBindCount) {
        getImageBindCount().setValue(imageBindCount);
    }

    protected static native long getImageBindCountNative(long address);
    protected static native void setImageBindCountNative(long address, long imageBindCount);

    public VkSparseImageMemoryBindInfo getPImageBinds() {
        return new VkSparseImageMemoryBindInfo(getVkMemory(), getPImageBindsNative(getVkAddress()));
    }

    private VkObject pImageBinds = null;
    public void setPImageBinds(VkSparseImageMemoryBindInfo pImageBinds) {
        setPImageBindsNative(getVkAddress(), pImageBinds != null ? pImageBinds.getVkAddress() : VkPointer.NULL);
        this.pImageBinds = pImageBinds;
    }

    protected static native long getPImageBindsNative(long address);
    protected static native void setPImageBindsNative(long address, long pImageBinds);

    public VkUInt32 getSignalSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getSignalSemaphoreCountNative(getVkAddress()));
    }

    
    public void setSignalSemaphoreCount(VkUInt32 signalSemaphoreCount) {
        setSignalSemaphoreCountNative(getVkAddress(), signalSemaphoreCount != null ? signalSemaphoreCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSignalSemaphoreCountQ() {
        return getSignalSemaphoreCount().getValue();
    }

    public void setSignalSemaphoreCount(int signalSemaphoreCount) {
        getSignalSemaphoreCount().setValue(signalSemaphoreCount);
    }

    protected static native long getSignalSemaphoreCountNative(long address);
    protected static native void setSignalSemaphoreCountNative(long address, long signalSemaphoreCount);

    public VkSemaphore getPSignalSemaphores() {
        return new VkSemaphore(getVkMemory(), getPSignalSemaphoresNative(getVkAddress()));
    }

    private VkObject pSignalSemaphores = null;
    public void setPSignalSemaphores(VkSemaphore pSignalSemaphores) {
        setPSignalSemaphoresNative(getVkAddress(), pSignalSemaphores != null ? pSignalSemaphores.getVkAddress() : VkPointer.NULL);
        this.pSignalSemaphores = pSignalSemaphores;
    }

    protected static native long getPSignalSemaphoresNative(long address);
    protected static native void setPSignalSemaphoresNative(long address, long pSignalSemaphores);


    public void set(VkBindSparseInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

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

}
