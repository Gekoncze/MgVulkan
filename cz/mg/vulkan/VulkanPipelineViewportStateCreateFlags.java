package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineViewportStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineViewportStateCreateFlags extends VulkanFlags {
    public VulkanPipelineViewportStateCreateFlags(){
        super(new VkPipelineViewportStateCreateFlags());
    }

    public VulkanPipelineViewportStateCreateFlags(VkPipelineViewportStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineViewportStateCreateFlags getVk(){
        return (VkPipelineViewportStateCreateFlags) super.getVk();
    }

    public VulkanPipelineViewportStateCreateFlags(int value){
        super(new VkPipelineViewportStateCreateFlags(value));
    }

    public static class Array extends VulkanPipelineViewportStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineViewportStateCreateFlags> {
        public Array(VkPipelineViewportStateCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineViewportStateCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineViewportStateCreateFlags o){
            this(new VkPipelineViewportStateCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineViewportStateCreateFlags.Array getVk(){
            return (VkPipelineViewportStateCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineViewportStateCreateFlags get(int i){
            return new VulkanPipelineViewportStateCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineViewportStateCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineViewportStateCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineViewportStateCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineViewportStateCreateFlags.Pointer getVk(){
            return (VkPipelineViewportStateCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineViewportStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineViewportStateCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineViewportStateCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineViewportStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineViewportStateCreateFlags.Pointer.Array getVk(){
                return (VkPipelineViewportStateCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineViewportStateCreateFlags.Pointer get(int i){
                return new VulkanPipelineViewportStateCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
