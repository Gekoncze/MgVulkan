package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineTessellationStateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineTessellationStateCreateFlags extends VulkanFlags {
    public VulkanPipelineTessellationStateCreateFlags(){
        super(new VkPipelineTessellationStateCreateFlags());
    }

    public VulkanPipelineTessellationStateCreateFlags(VkPipelineTessellationStateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineTessellationStateCreateFlags getVk(){
        return (VkPipelineTessellationStateCreateFlags) super.getVk();
    }

    public VulkanPipelineTessellationStateCreateFlags(int value){
        super(new VkPipelineTessellationStateCreateFlags(value));
    }

    public static class Array extends VulkanPipelineTessellationStateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineTessellationStateCreateFlags> {
        public Array(VkPipelineTessellationStateCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineTessellationStateCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineTessellationStateCreateFlags o){
            this(new VkPipelineTessellationStateCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineTessellationStateCreateFlags.Array getVk(){
            return (VkPipelineTessellationStateCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineTessellationStateCreateFlags get(int i){
            return new VulkanPipelineTessellationStateCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineTessellationStateCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineTessellationStateCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineTessellationStateCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineTessellationStateCreateFlags.Pointer getVk(){
            return (VkPipelineTessellationStateCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineTessellationStateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineTessellationStateCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineTessellationStateCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineTessellationStateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineTessellationStateCreateFlags.Pointer.Array getVk(){
                return (VkPipelineTessellationStateCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineTessellationStateCreateFlags.Pointer get(int i){
                return new VulkanPipelineTessellationStateCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
