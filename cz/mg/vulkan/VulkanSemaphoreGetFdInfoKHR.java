package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSemaphoreGetFdInfoKHR extends VulkanObject {
    public VulkanSemaphoreGetFdInfoKHR(){
        super(new VkSemaphoreGetFdInfoKHR());
    }

    public VulkanSemaphoreGetFdInfoKHR(VkSemaphoreGetFdInfoKHR vk){
        super(vk);
    }

    @Override
    public VkSemaphoreGetFdInfoKHR getVk(){
        return (VkSemaphoreGetFdInfoKHR) super.getVk();
    }
    public VulkanSemaphoreGetFdInfoKHR(VulkanObject pNext, VulkanSemaphore semaphore, VulkanExternalSemaphoreHandleTypeFlagBits handleType) {
        super(new VkSemaphoreGetFdInfoKHR(pNext.getVk(), semaphore.getVk(), handleType.getVk()));
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

    public VulkanExternalSemaphoreHandleTypeFlagBits getHandleType() {
        return new VulkanExternalSemaphoreHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalSemaphoreHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }


    public static class Array extends VulkanSemaphoreGetFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphoreGetFdInfoKHR> {
        public Array(VkSemaphoreGetFdInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSemaphoreGetFdInfoKHR.Array(count));
        }

        public Array(int count, VulkanSemaphoreGetFdInfoKHR o){
            this(new VkSemaphoreGetFdInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSemaphoreGetFdInfoKHR.Array getVk(){
            return (VkSemaphoreGetFdInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSemaphoreGetFdInfoKHR get(int i){
            return new VulkanSemaphoreGetFdInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSemaphoreGetFdInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSemaphoreGetFdInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSemaphoreGetFdInfoKHR.Pointer(value));
        }

        @Override
        public VkSemaphoreGetFdInfoKHR.Pointer getVk(){
            return (VkSemaphoreGetFdInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSemaphoreGetFdInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphoreGetFdInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkSemaphoreGetFdInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanSemaphoreGetFdInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSemaphoreGetFdInfoKHR.Pointer.Array getVk(){
                return (VkSemaphoreGetFdInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSemaphoreGetFdInfoKHR.Pointer get(int i){
                return new VulkanSemaphoreGetFdInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
