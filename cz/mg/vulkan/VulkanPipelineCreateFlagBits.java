package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanPipelineCreateFlagBits extends VulkanFlagBits {
    public static final int DISABLE_OPTIMIZATION = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT;
    public static final int ALLOW_DERIVATIVES = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT;
    public static final int DERIVATIVE = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DERIVATIVE_BIT;
    public static final int VIEW_INDEX_FROM_DEVICE_INDEX = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT;
    public static final int DISPATCH_BASE = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE;
    public static final int VIEW_INDEX_FROM_DEVICE_INDEX_KHR = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR;
    public static final int DISPATCH_BASE_KHR = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE_KHR;

    public VulkanPipelineCreateFlagBits(){
        super(new VkPipelineCreateFlagBits());
    }

    public VulkanPipelineCreateFlagBits(VkPipelineCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkPipelineCreateFlagBits getVk(){
        return (VkPipelineCreateFlagBits) super.getVk();
    }

    public VulkanPipelineCreateFlagBits(int value){
        super(new VkPipelineCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DISABLE_OPTIMIZATION) s += "DISABLE_OPTIMIZATION";
        if(getValue() == ALLOW_DERIVATIVES) s += "ALLOW_DERIVATIVES";
        if(getValue() == DERIVATIVE) s += "DERIVATIVE";
        if(getValue() == VIEW_INDEX_FROM_DEVICE_INDEX) s += "VIEW_INDEX_FROM_DEVICE_INDEX";
        if(getValue() == DISPATCH_BASE) s += "DISPATCH_BASE";
        if(getValue() == VIEW_INDEX_FROM_DEVICE_INDEX_KHR) s += "VIEW_INDEX_FROM_DEVICE_INDEX_KHR";
        if(getValue() == DISPATCH_BASE_KHR) s += "DISPATCH_BASE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanPipelineCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCreateFlagBits> {
        public Array(VkPipelineCreateFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineCreateFlagBits.Array(count));
        }

        public Array(int count, VulkanPipelineCreateFlagBits o){
            this(new VkPipelineCreateFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCreateFlagBits.Array getVk(){
            return (VkPipelineCreateFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCreateFlagBits get(int i){
            return new VulkanPipelineCreateFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineCreateFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineCreateFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineCreateFlagBits.Pointer(value));
        }

        @Override
        public VkPipelineCreateFlagBits.Pointer getVk(){
            return (VkPipelineCreateFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCreateFlagBits.Pointer> {
            public Array(int count) {
                super(new VkPipelineCreateFlagBits.Pointer.Array(count));
            }

            public Array(VulkanPipelineCreateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineCreateFlagBits.Pointer.Array getVk(){
                return (VkPipelineCreateFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineCreateFlagBits.Pointer get(int i){
                return new VulkanPipelineCreateFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
