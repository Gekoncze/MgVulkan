package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCacheCreateFlags.html">khronos documentation</a>
 **/
public class VulkanPipelineCacheCreateFlags extends VulkanFlags {
    public VulkanPipelineCacheCreateFlags(){
        super(new VkPipelineCacheCreateFlags());
    }

    public VulkanPipelineCacheCreateFlags(VkPipelineCacheCreateFlags vk){
        super(vk);
    }

    @Override
    public VkPipelineCacheCreateFlags getVk(){
        return (VkPipelineCacheCreateFlags) super.getVk();
    }

    public VulkanPipelineCacheCreateFlags(int value){
        super(new VkPipelineCacheCreateFlags(value));
    }

    public static class Array extends VulkanPipelineCacheCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCacheCreateFlags> {
        public Array(VkPipelineCacheCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineCacheCreateFlags.Array(count));
        }

        public Array(int count, VulkanPipelineCacheCreateFlags o){
            this(new VkPipelineCacheCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCacheCreateFlags.Array getVk(){
            return (VkPipelineCacheCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCacheCreateFlags get(int i){
            return new VulkanPipelineCacheCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineCacheCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineCacheCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineCacheCreateFlags.Pointer(value));
        }

        @Override
        public VkPipelineCacheCreateFlags.Pointer getVk(){
            return (VkPipelineCacheCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineCacheCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCacheCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkPipelineCacheCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanPipelineCacheCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineCacheCreateFlags.Pointer.Array getVk(){
                return (VkPipelineCacheCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineCacheCreateFlags.Pointer get(int i){
                return new VulkanPipelineCacheCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
