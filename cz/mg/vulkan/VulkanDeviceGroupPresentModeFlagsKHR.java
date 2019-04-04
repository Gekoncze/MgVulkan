package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupPresentModeFlagsKHR.html">khronos documentation</a>
 **/
public class VulkanDeviceGroupPresentModeFlagsKHR extends VulkanFlags {
    public VulkanDeviceGroupPresentModeFlagsKHR(){
        super(new VkDeviceGroupPresentModeFlagsKHR());
    }

    public VulkanDeviceGroupPresentModeFlagsKHR(VkDeviceGroupPresentModeFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupPresentModeFlagsKHR getVk(){
        return (VkDeviceGroupPresentModeFlagsKHR) super.getVk();
    }

    public VulkanDeviceGroupPresentModeFlagsKHR(int value){
        super(new VkDeviceGroupPresentModeFlagsKHR(value));
    }

    public static class Array extends VulkanDeviceGroupPresentModeFlagsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupPresentModeFlagsKHR> {
        public Array(VkDeviceGroupPresentModeFlagsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGroupPresentModeFlagsKHR.Array(count));
        }

        public Array(int count, VulkanDeviceGroupPresentModeFlagsKHR o){
            this(new VkDeviceGroupPresentModeFlagsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGroupPresentModeFlagsKHR.Array getVk(){
            return (VkDeviceGroupPresentModeFlagsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGroupPresentModeFlagsKHR get(int i){
            return new VulkanDeviceGroupPresentModeFlagsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGroupPresentModeFlagsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGroupPresentModeFlagsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGroupPresentModeFlagsKHR.Pointer(value));
        }

        @Override
        public VkDeviceGroupPresentModeFlagsKHR.Pointer getVk(){
            return (VkDeviceGroupPresentModeFlagsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGroupPresentModeFlagsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupPresentModeFlagsKHR.Pointer> {
            public Array(int count) {
                super(new VkDeviceGroupPresentModeFlagsKHR.Pointer.Array(count));
            }

            public Array(VulkanDeviceGroupPresentModeFlagsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGroupPresentModeFlagsKHR.Pointer.Array getVk(){
                return (VkDeviceGroupPresentModeFlagsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGroupPresentModeFlagsKHR.Pointer get(int i){
                return new VulkanDeviceGroupPresentModeFlagsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
