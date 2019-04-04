package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineLayoutCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineLayoutCreateFlags extends VulkanFlags {
    public VulkanPipelineLayoutCreateFlags(){
        super(new VkPipelineLayoutCreateFlags());
    }

    public VulkanPipelineLayoutCreateFlags(VkPipelineLayoutCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineLayoutCreateFlags getVk(){
        return (VkPipelineLayoutCreateFlags) super.getVk();
    }

    public VulkanPipelineLayoutCreateFlags(int value){
        super(new VkPipelineLayoutCreateFlags(value));
    }

    public static class Array extends VulkanPipelineLayoutCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineLayoutCreateFlags> {
        public Array(VkPipelineLayoutCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineLayoutCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineLayoutCreateFlags o){
            this(new VkPipelineLayoutCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineLayoutCreateFlags.Array getVk(){
            return (VkPipelineLayoutCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineLayoutCreateFlags get(int i){
            return new VulkanPipelineLayoutCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineLayoutCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineLayoutCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineLayoutCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineLayoutCreateFlags.Pointer getVk(){
            return (VkPipelineLayoutCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineLayoutCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineLayoutCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineLayoutCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineLayoutCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineLayoutCreateFlags.Pointer.Array getVk(){
                return (VkPipelineLayoutCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineLayoutCreateFlags.Pointer get(int i){
                return new VulkanPipelineLayoutCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
