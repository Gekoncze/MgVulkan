package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineVertexInputStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineVertexInputStateCreateFlags extends VulkanFlags {
    public VulkanPipelineVertexInputStateCreateFlags(){
        super(new VkPipelineVertexInputStateCreateFlags());
    }

    public VulkanPipelineVertexInputStateCreateFlags(VkPipelineVertexInputStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineVertexInputStateCreateFlags getVk(){
        return (VkPipelineVertexInputStateCreateFlags) super.getVk();
    }

    public VulkanPipelineVertexInputStateCreateFlags(int value){
        super(new VkPipelineVertexInputStateCreateFlags(value));
    }

    public static class Array extends VulkanPipelineVertexInputStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineVertexInputStateCreateFlags> {
        public Array(VkPipelineVertexInputStateCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineVertexInputStateCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineVertexInputStateCreateFlags o){
            this(new VkPipelineVertexInputStateCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineVertexInputStateCreateFlags.Array getVk(){
            return (VkPipelineVertexInputStateCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineVertexInputStateCreateFlags get(int i){
            return new VulkanPipelineVertexInputStateCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineVertexInputStateCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineVertexInputStateCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineVertexInputStateCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineVertexInputStateCreateFlags.Pointer getVk(){
            return (VkPipelineVertexInputStateCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineVertexInputStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineVertexInputStateCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineVertexInputStateCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineVertexInputStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineVertexInputStateCreateFlags.Pointer.Array getVk(){
                return (VkPipelineVertexInputStateCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineVertexInputStateCreateFlags.Pointer get(int i){
                return new VulkanPipelineVertexInputStateCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
