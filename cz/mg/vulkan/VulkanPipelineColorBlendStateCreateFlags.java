package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineColorBlendStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineColorBlendStateCreateFlags extends VulkanFlags {
    public VulkanPipelineColorBlendStateCreateFlags(){
        super(new VkPipelineColorBlendStateCreateFlags());
    }

    public VulkanPipelineColorBlendStateCreateFlags(VkPipelineColorBlendStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineColorBlendStateCreateFlags getVk(){
        return (VkPipelineColorBlendStateCreateFlags) super.getVk();
    }

    public VulkanPipelineColorBlendStateCreateFlags(int value){
        super(new VkPipelineColorBlendStateCreateFlags(value));
    }

    public static class Array extends VulkanPipelineColorBlendStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineColorBlendStateCreateFlags> {
        public Array(VkPipelineColorBlendStateCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineColorBlendStateCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineColorBlendStateCreateFlags o){
            this(new VkPipelineColorBlendStateCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineColorBlendStateCreateFlags.Array getVk(){
            return (VkPipelineColorBlendStateCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineColorBlendStateCreateFlags get(int i){
            return new VulkanPipelineColorBlendStateCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineColorBlendStateCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineColorBlendStateCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineColorBlendStateCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineColorBlendStateCreateFlags.Pointer getVk(){
            return (VkPipelineColorBlendStateCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineColorBlendStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineColorBlendStateCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineColorBlendStateCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineColorBlendStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineColorBlendStateCreateFlags.Pointer.Array getVk(){
                return (VkPipelineColorBlendStateCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineColorBlendStateCreateFlags.Pointer get(int i){
                return new VulkanPipelineColorBlendStateCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
