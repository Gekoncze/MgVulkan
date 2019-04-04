package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineDepthStencilStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineDepthStencilStateCreateFlags extends VulkanFlags {
    public VulkanPipelineDepthStencilStateCreateFlags(){
        super(new VkPipelineDepthStencilStateCreateFlags());
    }

    public VulkanPipelineDepthStencilStateCreateFlags(VkPipelineDepthStencilStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineDepthStencilStateCreateFlags getVk(){
        return (VkPipelineDepthStencilStateCreateFlags) super.getVk();
    }

    public VulkanPipelineDepthStencilStateCreateFlags(int value){
        super(new VkPipelineDepthStencilStateCreateFlags(value));
    }

    public static class Array extends VulkanPipelineDepthStencilStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDepthStencilStateCreateFlags> {
        public Array(VkPipelineDepthStencilStateCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineDepthStencilStateCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineDepthStencilStateCreateFlags o){
            this(new VkPipelineDepthStencilStateCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineDepthStencilStateCreateFlags.Array getVk(){
            return (VkPipelineDepthStencilStateCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineDepthStencilStateCreateFlags get(int i){
            return new VulkanPipelineDepthStencilStateCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineDepthStencilStateCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineDepthStencilStateCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineDepthStencilStateCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineDepthStencilStateCreateFlags.Pointer getVk(){
            return (VkPipelineDepthStencilStateCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineDepthStencilStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDepthStencilStateCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineDepthStencilStateCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineDepthStencilStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineDepthStencilStateCreateFlags.Pointer.Array getVk(){
                return (VkPipelineDepthStencilStateCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineDepthStencilStateCreateFlags.Pointer get(int i){
                return new VulkanPipelineDepthStencilStateCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
