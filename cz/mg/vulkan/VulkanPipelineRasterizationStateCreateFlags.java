package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineRasterizationStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineRasterizationStateCreateFlags extends VulkanFlags {
    public VulkanPipelineRasterizationStateCreateFlags(){
        super(new VkPipelineRasterizationStateCreateFlags());
    }

    public VulkanPipelineRasterizationStateCreateFlags(VkPipelineRasterizationStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineRasterizationStateCreateFlags getVk(){
        return (VkPipelineRasterizationStateCreateFlags) super.getVk();
    }

    public VulkanPipelineRasterizationStateCreateFlags(int value){
        super(new VkPipelineRasterizationStateCreateFlags(value));
    }

    public static class Array extends VulkanPipelineRasterizationStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineRasterizationStateCreateFlags> {
        public Array(VkPipelineRasterizationStateCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineRasterizationStateCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineRasterizationStateCreateFlags o){
            this(new VkPipelineRasterizationStateCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineRasterizationStateCreateFlags.Array getVk(){
            return (VkPipelineRasterizationStateCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineRasterizationStateCreateFlags get(int i){
            return new VulkanPipelineRasterizationStateCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineRasterizationStateCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineRasterizationStateCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineRasterizationStateCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineRasterizationStateCreateFlags.Pointer getVk(){
            return (VkPipelineRasterizationStateCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineRasterizationStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineRasterizationStateCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineRasterizationStateCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineRasterizationStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineRasterizationStateCreateFlags.Pointer.Array getVk(){
                return (VkPipelineRasterizationStateCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineRasterizationStateCreateFlags.Pointer get(int i){
                return new VulkanPipelineRasterizationStateCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
