package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBindSparseInfo extends VulkanObject {
    public VulkanBindSparseInfo(){
        super(new VkBindSparseInfo());
    }

    public VulkanBindSparseInfo(VkBindSparseInfo vk){
        super(vk);
    }

    @Override
    public VkBindSparseInfo getVk(){
        return (VkBindSparseInfo) super.getVk();
    }
    public VulkanBindSparseInfo(VulkanObject pNext, VulkanUInt32 waitSemaphoreCount, VulkanSemaphore pWaitSemaphores, VulkanUInt32 bufferBindCount, VulkanSparseBufferMemoryBindInfo pBufferBinds, VulkanUInt32 imageOpaqueBindCount, VulkanSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds, VulkanUInt32 imageBindCount, VulkanSparseImageMemoryBindInfo pImageBinds, VulkanUInt32 signalSemaphoreCount, VulkanSemaphore pSignalSemaphores) {
        super(new VkBindSparseInfo(pNext.getVk(), waitSemaphoreCount.getVk(), pWaitSemaphores.getVk(), bufferBindCount.getVk(), pBufferBinds.getVk(), imageOpaqueBindCount.getVk(), pImageOpaqueBinds.getVk(), imageBindCount.getVk(), pImageBinds.getVk(), signalSemaphoreCount.getVk(), pSignalSemaphores.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanUInt32 getWaitSemaphoreCount() {
        return new VulkanUInt32(getVk().getWaitSemaphoreCount());
    }

    public void setWaitSemaphoreCount(VulkanUInt32 waitSemaphoreCount) {
        getVk().setWaitSemaphoreCount(waitSemaphoreCount.getVk());
    }

    public VulkanSemaphore getPWaitSemaphores() {
        return new VulkanSemaphore(getVk().getPWaitSemaphores());
    }

    public void setPWaitSemaphores(VulkanSemaphore pWaitSemaphores) {
        getVk().setPWaitSemaphores(pWaitSemaphores.getVk());
    }

    public VulkanUInt32 getBufferBindCount() {
        return new VulkanUInt32(getVk().getBufferBindCount());
    }

    public void setBufferBindCount(VulkanUInt32 bufferBindCount) {
        getVk().setBufferBindCount(bufferBindCount.getVk());
    }

    public VulkanSparseBufferMemoryBindInfo getPBufferBinds() {
        return new VulkanSparseBufferMemoryBindInfo(getVk().getPBufferBinds());
    }

    public void setPBufferBinds(VulkanSparseBufferMemoryBindInfo pBufferBinds) {
        getVk().setPBufferBinds(pBufferBinds.getVk());
    }

    public VulkanUInt32 getImageOpaqueBindCount() {
        return new VulkanUInt32(getVk().getImageOpaqueBindCount());
    }

    public void setImageOpaqueBindCount(VulkanUInt32 imageOpaqueBindCount) {
        getVk().setImageOpaqueBindCount(imageOpaqueBindCount.getVk());
    }

    public VulkanSparseImageOpaqueMemoryBindInfo getPImageOpaqueBinds() {
        return new VulkanSparseImageOpaqueMemoryBindInfo(getVk().getPImageOpaqueBinds());
    }

    public void setPImageOpaqueBinds(VulkanSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds) {
        getVk().setPImageOpaqueBinds(pImageOpaqueBinds.getVk());
    }

    public VulkanUInt32 getImageBindCount() {
        return new VulkanUInt32(getVk().getImageBindCount());
    }

    public void setImageBindCount(VulkanUInt32 imageBindCount) {
        getVk().setImageBindCount(imageBindCount.getVk());
    }

    public VulkanSparseImageMemoryBindInfo getPImageBinds() {
        return new VulkanSparseImageMemoryBindInfo(getVk().getPImageBinds());
    }

    public void setPImageBinds(VulkanSparseImageMemoryBindInfo pImageBinds) {
        getVk().setPImageBinds(pImageBinds.getVk());
    }

    public VulkanUInt32 getSignalSemaphoreCount() {
        return new VulkanUInt32(getVk().getSignalSemaphoreCount());
    }

    public void setSignalSemaphoreCount(VulkanUInt32 signalSemaphoreCount) {
        getVk().setSignalSemaphoreCount(signalSemaphoreCount.getVk());
    }

    public VulkanSemaphore getPSignalSemaphores() {
        return new VulkanSemaphore(getVk().getPSignalSemaphores());
    }

    public void setPSignalSemaphores(VulkanSemaphore pSignalSemaphores) {
        getVk().setPSignalSemaphores(pSignalSemaphores.getVk());
    }


    public static class Array extends VulkanBindSparseInfo implements cz.mg.collections.array.ReadonlyArray<VulkanBindSparseInfo> {
        public Array(VkBindSparseInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBindSparseInfo.Array(count));
        }

        public Array(int count, VulkanBindSparseInfo o){
            this(new VkBindSparseInfo.Array(count, o.getVk()));
        }

        @Override
        public VkBindSparseInfo.Array getVk(){
            return (VkBindSparseInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBindSparseInfo get(int i){
            return new VulkanBindSparseInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBindSparseInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBindSparseInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkBindSparseInfo.Pointer(value));
        }

        @Override
        public VkBindSparseInfo.Pointer getVk(){
            return (VkBindSparseInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanBindSparseInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBindSparseInfo.Pointer> {
            public Array(int count) {
                super(new VkBindSparseInfo.Pointer.Array(count));
            }

            public Array(VulkanBindSparseInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBindSparseInfo.Pointer.Array getVk(){
                return (VkBindSparseInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBindSparseInfo.Pointer get(int i){
                return new VulkanBindSparseInfo.Pointer(getVk().get(i));
            }
        }
    }
}
