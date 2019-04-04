package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineInputAssemblyStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineInputAssemblyStateCreateFlags extends VulkanFlags {
    public VulkanPipelineInputAssemblyStateCreateFlags(){
        super(new VkPipelineInputAssemblyStateCreateFlags());
    }

    public VulkanPipelineInputAssemblyStateCreateFlags(VkPipelineInputAssemblyStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineInputAssemblyStateCreateFlags getVk(){
        return (VkPipelineInputAssemblyStateCreateFlags) super.getVk();
    }

    public VulkanPipelineInputAssemblyStateCreateFlags(int value){
        super(new VkPipelineInputAssemblyStateCreateFlags(value));
    }

    public static class Array extends VulkanPipelineInputAssemblyStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineInputAssemblyStateCreateFlags> {
        public Array(VkPipelineInputAssemblyStateCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineInputAssemblyStateCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineInputAssemblyStateCreateFlags o){
            this(new VkPipelineInputAssemblyStateCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineInputAssemblyStateCreateFlags.Array getVk(){
            return (VkPipelineInputAssemblyStateCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineInputAssemblyStateCreateFlags get(int i){
            return new VulkanPipelineInputAssemblyStateCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineInputAssemblyStateCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineInputAssemblyStateCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineInputAssemblyStateCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineInputAssemblyStateCreateFlags.Pointer getVk(){
            return (VkPipelineInputAssemblyStateCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineInputAssemblyStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineInputAssemblyStateCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineInputAssemblyStateCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineInputAssemblyStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineInputAssemblyStateCreateFlags.Pointer.Array getVk(){
                return (VkPipelineInputAssemblyStateCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineInputAssemblyStateCreateFlags.Pointer get(int i){
                return new VulkanPipelineInputAssemblyStateCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
