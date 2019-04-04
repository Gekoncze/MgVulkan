package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFenceGetFdInfoKHR.html">khronos documentation</a>
 **/
public class VulkanFenceGetFdInfoKHR extends VulkanObject {
    public VulkanFenceGetFdInfoKHR(){
        super(new VkFenceGetFdInfoKHR());
    }

    public VulkanFenceGetFdInfoKHR(VkFenceGetFdInfoKHR vk){
        super(vk);
    }

    @Override
    public VkFenceGetFdInfoKHR getVk(){
        return (VkFenceGetFdInfoKHR) super.getVk();
    }
    public VulkanFenceGetFdInfoKHR(VulkanObject pNext, VulkanFence fence, VulkanExternalFenceHandleTypeFlagBits handleType) {
        super(new VkFenceGetFdInfoKHR(pNext.getVk(), fence.getVk(), handleType.getVk()));
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

    public VulkanFence getFence() {
        return new VulkanFence(getVk().getFence());
    }

    public void setFence(VulkanFence fence) {
        getVk().setFence(fence.getVk());
    }

    public VulkanExternalFenceHandleTypeFlagBits getHandleType() {
        return new VulkanExternalFenceHandleTypeFlagBits(getVk().getHandleType());
    }

    public void setHandleType(VulkanExternalFenceHandleTypeFlagBits handleType) {
        getVk().setHandleType(handleType.getVk());
    }


    public static class Array extends VulkanFenceGetFdInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanFenceGetFdInfoKHR> {
        public Array(VkFenceGetFdInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFenceGetFdInfoKHR.Array(count));
        }

        public Array(int count, VulkanFenceGetFdInfoKHR o){
            this(new VkFenceGetFdInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkFenceGetFdInfoKHR.Array getVk(){
            return (VkFenceGetFdInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFenceGetFdInfoKHR get(int i){
            return new VulkanFenceGetFdInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFenceGetFdInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFenceGetFdInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkFenceGetFdInfoKHR.Pointer(value));
        }

        @Override
        public VkFenceGetFdInfoKHR.Pointer getVk(){
            return (VkFenceGetFdInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanFenceGetFdInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFenceGetFdInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkFenceGetFdInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanFenceGetFdInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFenceGetFdInfoKHR.Pointer.Array getVk(){
                return (VkFenceGetFdInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFenceGetFdInfoKHR.Pointer get(int i){
                return new VulkanFenceGetFdInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
