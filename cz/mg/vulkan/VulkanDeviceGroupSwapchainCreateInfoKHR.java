package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupSwapchainCreateInfoKHR.html">khronos documentation</a>
 **/
public class VulkanDeviceGroupSwapchainCreateInfoKHR extends VulkanObject {
    public VulkanDeviceGroupSwapchainCreateInfoKHR(){
        super(new VkDeviceGroupSwapchainCreateInfoKHR());
    }

    public VulkanDeviceGroupSwapchainCreateInfoKHR(VkDeviceGroupSwapchainCreateInfoKHR vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupSwapchainCreateInfoKHR getVk(){
        return (VkDeviceGroupSwapchainCreateInfoKHR) super.getVk();
    }
    public VulkanDeviceGroupSwapchainCreateInfoKHR(VulkanObject pNext, VulkanDeviceGroupPresentModeFlagsKHR modes) {
        super(new VkDeviceGroupSwapchainCreateInfoKHR(pNext.getVk(), modes.getVk()));
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

    public VulkanDeviceGroupPresentModeFlagsKHR getModes() {
        return new VulkanDeviceGroupPresentModeFlagsKHR(getVk().getModes());
    }

    public void setModes(VulkanDeviceGroupPresentModeFlagsKHR modes) {
        getVk().setModes(modes.getVk());
    }


    public static class Array extends VulkanDeviceGroupSwapchainCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupSwapchainCreateInfoKHR> {
        public Array(VkDeviceGroupSwapchainCreateInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGroupSwapchainCreateInfoKHR.Array(count));
        }

        public Array(int count, VulkanDeviceGroupSwapchainCreateInfoKHR o){
            this(new VkDeviceGroupSwapchainCreateInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGroupSwapchainCreateInfoKHR.Array getVk(){
            return (VkDeviceGroupSwapchainCreateInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGroupSwapchainCreateInfoKHR get(int i){
            return new VulkanDeviceGroupSwapchainCreateInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGroupSwapchainCreateInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGroupSwapchainCreateInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGroupSwapchainCreateInfoKHR.Pointer(value));
        }

        @Override
        public VkDeviceGroupSwapchainCreateInfoKHR.Pointer getVk(){
            return (VkDeviceGroupSwapchainCreateInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGroupSwapchainCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupSwapchainCreateInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkDeviceGroupSwapchainCreateInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanDeviceGroupSwapchainCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGroupSwapchainCreateInfoKHR.Pointer.Array getVk(){
                return (VkDeviceGroupSwapchainCreateInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGroupSwapchainCreateInfoKHR.Pointer get(int i){
                return new VulkanDeviceGroupSwapchainCreateInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
