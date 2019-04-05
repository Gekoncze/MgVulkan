package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImportSemaphoreFdInfoKHR extends VulkanObject {
    public VulkanImportSemaphoreFdInfoKHR(){
        super(new VkImportSemaphoreFdInfoKHR());
    }

    public VulkanImportSemaphoreFdInfoKHR(VkImportSemaphoreFdInfoKHR vk){
        super(vk);
    }

    @Override
    public VkImportSemaphoreFdInfoKHR getVk(){
        return (VkImportSemaphoreFdInfoKHR) super.getVk();
    }
    public VulkanImportSemaphoreFdInfoKHR(VulkanObject pNext, VulkanSemaphore semaphore, VulkanSemaphoreImportFlags flags, VulkanExternalSemaphoreHandleTypeFlagBits handleType, VulkanInt fd) {
        super(new VkImportSemaphoreFdInfoKHR(pNext.getVk(), semaphore.getVk(), flags.getVk(), handleType.getVk(), fd.getVk()));
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

    public VulkanSemaphore getSemaphore() {
        return new VulkanSemaphore(getVk().getSemaphore());
    }

    public void setSemaphore(VulkanSemaphore semaphore) {
        getVk().setSemaphore(semaphore.getVk());
    }

    public VulkanSemaphoreImportFlags getFlags() {
        return new VulkanSemaphoreImportFlags(getVk().getFlags());
    }

    public void setFlags(VulkanSemaphoreImportFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanExternalSemaphoreHandleTypeFlagBits getHandleType() {
        return new VulkanExternalSemaphoreHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalSemaphoreHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }

    public VulkanInt getFd() {
        return new VulkanInt(getVk().getFd());
    }

    public void setFd(VulkanInt fd) {
        getVk().setFd(fd.getVk());
    }


    public static class Array extends VulkanImportSemaphoreFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanImportSemaphoreFdInfoKHR> {
        public Array(VkImportSemaphoreFdInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImportSemaphoreFdInfoKHR.Array(count));
        }

        public Array(int count, VulkanImportSemaphoreFdInfoKHR o){
            this(new VkImportSemaphoreFdInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkImportSemaphoreFdInfoKHR.Array getVk(){
            return (VkImportSemaphoreFdInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImportSemaphoreFdInfoKHR get(int i){
            return new VulkanImportSemaphoreFdInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImportSemaphoreFdInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImportSemaphoreFdInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkImportSemaphoreFdInfoKHR.Pointer(value));
        }

        @Override
        public VkImportSemaphoreFdInfoKHR.Pointer getVk(){
            return (VkImportSemaphoreFdInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanImportSemaphoreFdInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImportSemaphoreFdInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkImportSemaphoreFdInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanImportSemaphoreFdInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImportSemaphoreFdInfoKHR.Pointer.Array getVk(){
                return (VkImportSemaphoreFdInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImportSemaphoreFdInfoKHR.Pointer get(int i){
                return new VulkanImportSemaphoreFdInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
