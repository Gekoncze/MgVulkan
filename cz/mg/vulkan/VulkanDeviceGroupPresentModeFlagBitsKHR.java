package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGroupPresentModeFlagBitsKHR.html">khronos documentation</a>
 **/
public class VulkanDeviceGroupPresentModeFlagBitsKHR extends VulkanFlagBits {
    public static final int DEVICE_GROUP_PRESENT_MODE_LOCAL_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR;
    public static final int DEVICE_GROUP_PRESENT_MODE_REMOTE_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR;
    public static final int DEVICE_GROUP_PRESENT_MODE_SUM_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR;
    public static final int DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_KHR = VkDeviceGroupPresentModeFlagBitsKHR.VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR;

    public VulkanDeviceGroupPresentModeFlagBitsKHR(){
        super(new VkDeviceGroupPresentModeFlagBitsKHR());
    }

    public VulkanDeviceGroupPresentModeFlagBitsKHR(VkDeviceGroupPresentModeFlagBitsKHR vk){
        super(vk);
    }

    @Override
    public VkDeviceGroupPresentModeFlagBitsKHR getVk(){
        return (VkDeviceGroupPresentModeFlagBitsKHR) super.getVk();
    }

    public VulkanDeviceGroupPresentModeFlagBitsKHR(int value){
        super(new VkDeviceGroupPresentModeFlagBitsKHR(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEVICE_GROUP_PRESENT_MODE_LOCAL_KHR) s += "DEVICE_GROUP_PRESENT_MODE_LOCAL_KHR";
        if(getValue() == DEVICE_GROUP_PRESENT_MODE_REMOTE_KHR) s += "DEVICE_GROUP_PRESENT_MODE_REMOTE_KHR";
        if(getValue() == DEVICE_GROUP_PRESENT_MODE_SUM_KHR) s += "DEVICE_GROUP_PRESENT_MODE_SUM_KHR";
        if(getValue() == DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_KHR) s += "DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanDeviceGroupPresentModeFlagBitsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupPresentModeFlagBitsKHR> {
        public Array(VkDeviceGroupPresentModeFlagBitsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGroupPresentModeFlagBitsKHR.Array(count));
        }

        public Array(int count, VulkanDeviceGroupPresentModeFlagBitsKHR o){
            this(new VkDeviceGroupPresentModeFlagBitsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGroupPresentModeFlagBitsKHR.Array getVk(){
            return (VkDeviceGroupPresentModeFlagBitsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGroupPresentModeFlagBitsKHR get(int i){
            return new VulkanDeviceGroupPresentModeFlagBitsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGroupPresentModeFlagBitsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGroupPresentModeFlagBitsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGroupPresentModeFlagBitsKHR.Pointer(value));
        }

        @Override
        public VkDeviceGroupPresentModeFlagBitsKHR.Pointer getVk(){
            return (VkDeviceGroupPresentModeFlagBitsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGroupPresentModeFlagBitsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGroupPresentModeFlagBitsKHR.Pointer> {
            public Array(int count) {
                super(new VkDeviceGroupPresentModeFlagBitsKHR.Pointer.Array(count));
            }

            public Array(VulkanDeviceGroupPresentModeFlagBitsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGroupPresentModeFlagBitsKHR.Pointer.Array getVk(){
                return (VkDeviceGroupPresentModeFlagBitsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGroupPresentModeFlagBitsKHR.Pointer get(int i){
                return new VulkanDeviceGroupPresentModeFlagBitsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
