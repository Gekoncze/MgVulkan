package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPresentModeKHR.html">khronos documentation</a>
 **/
public class VulkanPresentModeKHR extends VulkanEnum {
    public static final int PRESENT_MODE_IMMEDIATE_KHR = VkPresentModeKHR.VK_PRESENT_MODE_IMMEDIATE_KHR;
    public static final int PRESENT_MODE_MAILBOX_KHR = VkPresentModeKHR.VK_PRESENT_MODE_MAILBOX_KHR;
    public static final int PRESENT_MODE_FIFO_KHR = VkPresentModeKHR.VK_PRESENT_MODE_FIFO_KHR;
    public static final int PRESENT_MODE_FIFO_RELAXED_KHR = VkPresentModeKHR.VK_PRESENT_MODE_FIFO_RELAXED_KHR;
    public static final int PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR = VkPresentModeKHR.VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR;
    public static final int PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = VkPresentModeKHR.VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR;

    public VulkanPresentModeKHR(){
        super(new VkPresentModeKHR());
    }

    public VulkanPresentModeKHR(VkPresentModeKHR vk){
        super(vk);
    }

    @Override
    public VkPresentModeKHR getVk(){
        return (VkPresentModeKHR) super.getVk();
    }

    public VulkanPresentModeKHR(int value){
        super(new VkPresentModeKHR(value));
    }

    @Override
    public String toString() {
        if(getValue() == PRESENT_MODE_IMMEDIATE_KHR) return "PRESENT_MODE_IMMEDIATE_KHR";
        if(getValue() == PRESENT_MODE_MAILBOX_KHR) return "PRESENT_MODE_MAILBOX_KHR";
        if(getValue() == PRESENT_MODE_FIFO_KHR) return "PRESENT_MODE_FIFO_KHR";
        if(getValue() == PRESENT_MODE_FIFO_RELAXED_KHR) return "PRESENT_MODE_FIFO_RELAXED_KHR";
        if(getValue() == PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR) return "PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR";
        if(getValue() == PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR) return "PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanPresentModeKHR implements cz.mg.collections.array.ReadonlyArray<VulkanPresentModeKHR> {
        public Array(VkPresentModeKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPresentModeKHR.Array(count));
        }

        public Array(int count, VulkanPresentModeKHR o){
            this(new VkPresentModeKHR.Array(count, o.getVk()));
        }

        @Override
        public VkPresentModeKHR.Array getVk(){
            return (VkPresentModeKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPresentModeKHR get(int i){
            return new VulkanPresentModeKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPresentModeKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPresentModeKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkPresentModeKHR.Pointer(value));
        }

        @Override
        public VkPresentModeKHR.Pointer getVk(){
            return (VkPresentModeKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanPresentModeKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPresentModeKHR.Pointer> {
            public Array(int count) {
                super(new VkPresentModeKHR.Pointer.Array(count));
            }

            public Array(VulkanPresentModeKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPresentModeKHR.Pointer.Array getVk(){
                return (VkPresentModeKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPresentModeKHR.Pointer get(int i){
                return new VulkanPresentModeKHR.Pointer(getVk().get(i));
            }
        }
    }
}
