package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineShaderStageCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineShaderStageCreateFlags extends VulkanFlags {
    public VulkanPipelineShaderStageCreateFlags(){
        super(new VkPipelineShaderStageCreateFlags());
    }

    public VulkanPipelineShaderStageCreateFlags(VkPipelineShaderStageCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineShaderStageCreateFlags getVk(){
        return (VkPipelineShaderStageCreateFlags) super.getVk();
    }

    public VulkanPipelineShaderStageCreateFlags(int value){
        super(new VkPipelineShaderStageCreateFlags(value));
    }

    public static class Array extends VulkanPipelineShaderStageCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineShaderStageCreateFlags> {
        public Array(VkPipelineShaderStageCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineShaderStageCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineShaderStageCreateFlags o){
            this(new VkPipelineShaderStageCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineShaderStageCreateFlags.Array getVk(){
            return (VkPipelineShaderStageCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineShaderStageCreateFlags get(int i){
            return new VulkanPipelineShaderStageCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineShaderStageCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineShaderStageCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineShaderStageCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineShaderStageCreateFlags.Pointer getVk(){
            return (VkPipelineShaderStageCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineShaderStageCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineShaderStageCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineShaderStageCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineShaderStageCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineShaderStageCreateFlags.Pointer.Array getVk(){
                return (VkPipelineShaderStageCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineShaderStageCreateFlags.Pointer get(int i){
                return new VulkanPipelineShaderStageCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
