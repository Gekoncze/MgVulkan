package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCache.html">khronos documentation</a>
 **/
public class VulkanPipelineCache extends VulkanHandle {
    public VulkanPipelineCache(){
        super(new VkPipelineCache());
    }

    public VulkanPipelineCache(VkPipelineCache vk){
        super(vk);
    }

    @Override
    public VkPipelineCache getVk(){
        return (VkPipelineCache) super.getVk();
    }

    public VulkanPipelineCache(int value){
        super(new VkPipelineCache(value));
    }

    public static class Array extends VulkanPipelineCache implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCache> {
        public Array(VkPipelineCache.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineCache.Array(count));
        }

        public Array(int count, VulkanPipelineCache o){
            this(new VkPipelineCache.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCache.Array getVk(){
            return (VkPipelineCache.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCache get(int i){
            return new VulkanPipelineCache(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineCache.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineCache.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineCache.Pointer(value));
        }

        @Override
        public VkPipelineCache.Pointer getVk(){
            return (VkPipelineCache.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineCache.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCache.Pointer> {
            public Array(int count) {
                super(new VkPipelineCache.Pointer.Array(count));
            }

            public Array(VulkanPipelineCache[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineCache.Pointer.Array getVk(){
                return (VkPipelineCache.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineCache.Pointer get(int i){
                return new VulkanPipelineCache.Pointer(getVk().get(i));
            }
        }
    }
}
