package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBindSparseInfo.html">khronos documentation</a>
 **/
public class VkBindSparseInfo extends VkObject {
    public VkBindSparseInfo() {
        super(sizeof());
    }

    public VkBindSparseInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkBindSparseInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkBindSparseInfo(VkObject pNext, VkUInt32 waitSemaphoreCount, VkSemaphore pWaitSemaphores, VkUInt32 bufferBindCount, VkSparseBufferMemoryBindInfo pBufferBinds, VkUInt32 imageOpaqueBindCount, VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds, VkUInt32 imageBindCount, VkSparseImageMemoryBindInfo pImageBinds, VkUInt32 signalSemaphoreCount, VkSemaphore pSignalSemaphores) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO));
        setPNext(pNext);
        setWaitSemaphoreCount(waitSemaphoreCount);
        setPWaitSemaphores(pWaitSemaphores);
        setBufferBindCount(bufferBindCount);
        setPBufferBinds(pBufferBinds);
        setImageOpaqueBindCount(imageOpaqueBindCount);
        setPImageOpaqueBinds(pImageOpaqueBinds);
        setImageBindCount(imageBindCount);
        setPImageBinds(pImageBinds);
        setSignalSemaphoreCount(signalSemaphoreCount);
        setPSignalSemaphores(pSignalSemaphores);
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

    public VkUInt32 getWaitSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getWaitSemaphoreCount(getVkAddress()));
    }

    public void setWaitSemaphoreCount(VkUInt32 waitSemaphoreCount) {
        setWaitSemaphoreCount(getVkAddress(), waitSemaphoreCount.getVkAddress());
    }

    private static native long getWaitSemaphoreCount(long address);
    private static native void setWaitSemaphoreCount(long address, long waitSemaphoreCount);

    public VkSemaphore.Array getPWaitSemaphores() {
        return new VkSemaphore.Array(getVkMemory(), getPWaitSemaphores(getVkAddress()), getWaitSemaphoreCount().getValue());
    }

    public void setPWaitSemaphores(VkSemaphore pWaitSemaphores) {
        setPWaitSemaphores(getVkAddress(), pWaitSemaphores.getVkAddress());
    }

    private static native long getPWaitSemaphores(long address);
    private static native void setPWaitSemaphores(long address, long pWaitSemaphores);

    public VkUInt32 getBufferBindCount() {
        return new VkUInt32(getVkMemory(), getBufferBindCount(getVkAddress()));
    }

    public void setBufferBindCount(VkUInt32 bufferBindCount) {
        setBufferBindCount(getVkAddress(), bufferBindCount.getVkAddress());
    }

    private static native long getBufferBindCount(long address);
    private static native void setBufferBindCount(long address, long bufferBindCount);

    public VkSparseBufferMemoryBindInfo.Array getPBufferBinds() {
        return new VkSparseBufferMemoryBindInfo.Array(getVkMemory(), getPBufferBinds(getVkAddress()), getBufferBindCount().getValue());
    }

    public void setPBufferBinds(VkSparseBufferMemoryBindInfo pBufferBinds) {
        setPBufferBinds(getVkAddress(), pBufferBinds.getVkAddress());
    }

    private static native long getPBufferBinds(long address);
    private static native void setPBufferBinds(long address, long pBufferBinds);

    public VkUInt32 getImageOpaqueBindCount() {
        return new VkUInt32(getVkMemory(), getImageOpaqueBindCount(getVkAddress()));
    }

    public void setImageOpaqueBindCount(VkUInt32 imageOpaqueBindCount) {
        setImageOpaqueBindCount(getVkAddress(), imageOpaqueBindCount.getVkAddress());
    }

    private static native long getImageOpaqueBindCount(long address);
    private static native void setImageOpaqueBindCount(long address, long imageOpaqueBindCount);

    public VkSparseImageOpaqueMemoryBindInfo.Array getPImageOpaqueBinds() {
        return new VkSparseImageOpaqueMemoryBindInfo.Array(getVkMemory(), getPImageOpaqueBinds(getVkAddress()), getImageOpaqueBindCount().getValue());
    }

    public void setPImageOpaqueBinds(VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds) {
        setPImageOpaqueBinds(getVkAddress(), pImageOpaqueBinds.getVkAddress());
    }

    private static native long getPImageOpaqueBinds(long address);
    private static native void setPImageOpaqueBinds(long address, long pImageOpaqueBinds);

    public VkUInt32 getImageBindCount() {
        return new VkUInt32(getVkMemory(), getImageBindCount(getVkAddress()));
    }

    public void setImageBindCount(VkUInt32 imageBindCount) {
        setImageBindCount(getVkAddress(), imageBindCount.getVkAddress());
    }

    private static native long getImageBindCount(long address);
    private static native void setImageBindCount(long address, long imageBindCount);

    public VkSparseImageMemoryBindInfo.Array getPImageBinds() {
        return new VkSparseImageMemoryBindInfo.Array(getVkMemory(), getPImageBinds(getVkAddress()), getImageBindCount().getValue());
    }

    public void setPImageBinds(VkSparseImageMemoryBindInfo pImageBinds) {
        setPImageBinds(getVkAddress(), pImageBinds.getVkAddress());
    }

    private static native long getPImageBinds(long address);
    private static native void setPImageBinds(long address, long pImageBinds);

    public VkUInt32 getSignalSemaphoreCount() {
        return new VkUInt32(getVkMemory(), getSignalSemaphoreCount(getVkAddress()));
    }

    public void setSignalSemaphoreCount(VkUInt32 signalSemaphoreCount) {
        setSignalSemaphoreCount(getVkAddress(), signalSemaphoreCount.getVkAddress());
    }

    private static native long getSignalSemaphoreCount(long address);
    private static native void setSignalSemaphoreCount(long address, long signalSemaphoreCount);

    public VkSemaphore.Array getPSignalSemaphores() {
        return new VkSemaphore.Array(getVkMemory(), getPSignalSemaphores(getVkAddress()), getSignalSemaphoreCount().getValue());
    }

    public void setPSignalSemaphores(VkSemaphore pSignalSemaphores) {
        setPSignalSemaphores(getVkAddress(), pSignalSemaphores.getVkAddress());
    }

    private static native long getPSignalSemaphores(long address);
    private static native void setPSignalSemaphores(long address, long pSignalSemaphores);


    public static native long sizeof();

    public static class Array extends VkBindSparseInfo implements cz.mg.collections.array.ReadonlyArray<VkBindSparseInfo> {
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

            public Array(VkBindSparseInfo[] a) {
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
