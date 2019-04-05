package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryGetFdInfoKHR extends VulkanObject {
    public VulkanMemoryGetFdInfoKHR(){
        super(new VkMemoryGetFdInfoKHR());
    }

    public VulkanMemoryGetFdInfoKHR(VkMemoryGetFdInfoKHR vk){
        super(vk);
    }

    @Override
    public VkMemoryGetFdInfoKHR getVk(){
        return (VkMemoryGetFdInfoKHR) super.getVk();
    }
    public VulkanMemoryGetFdInfoKHR(VulkanObject pNext, VulkanDeviceMemory memory, VulkanExternalMemoryHandleTypeFlagBits handleType) {
        super(new VkMemoryGetFdInfoKHR(pNext.getVk(), memory.getVk(), handleType.getVk()));
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

    public VulkanDeviceMemory getMemory() {
        return new VulkanDeviceMemory(getVk().getMemory());
    }

    public void setMemory(VulkanDeviceMemory memory) {
        getVk().setMemory(memory.getVk());
    }

    public VulkanExternalMemoryHandleTypeFlagBits getHandleType() {
        return new VulkanExternalMemoryHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalMemoryHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }


    public static class Array extends VulkanMemoryGetFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryGetFdInfoKHR> {
        public Array(VkMemoryGetFdInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryGetFdInfoKHR.Array(count));
        }

        public Array(int count, VulkanMemoryGetFdInfoKHR o){
            this(new VkMemoryGetFdInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryGetFdInfoKHR.Array getVk(){
            return (VkMemoryGetFdInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryGetFdInfoKHR get(int i){
            return new VulkanMemoryGetFdInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryGetFdInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryGetFdInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryGetFdInfoKHR.Pointer(value));
        }

        @Override
        public VkMemoryGetFdInfoKHR.Pointer getVk(){
            return (VkMemoryGetFdInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryGetFdInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryGetFdInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkMemoryGetFdInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanMemoryGetFdInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryGetFdInfoKHR.Pointer.Array getVk(){
                return (VkMemoryGetFdInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryGetFdInfoKHR.Pointer get(int i){
                return new VulkanMemoryGetFdInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
