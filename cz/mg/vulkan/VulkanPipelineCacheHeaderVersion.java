package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCacheHeaderVersion.html">khronos documentation</a>
 **/
public class VulkanPipelineCacheHeaderVersion extends VulkanEnum {
    public static final int ONE = VkPipelineCacheHeaderVersion.VK_PIPELINE_CACHE_HEADER_VERSION_ONE;

    public VulkanPipelineCacheHeaderVersion(){
        super(new VkPipelineCacheHeaderVersion());
    }

    public VulkanPipelineCacheHeaderVersion(VkPipelineCacheHeaderVersion vk){
        super(vk);
    }

    @Override
    public VkPipelineCacheHeaderVersion getVk(){
        return (VkPipelineCacheHeaderVersion) super.getVk();
    }

    public VulkanPipelineCacheHeaderVersion(int value){
        super(new VkPipelineCacheHeaderVersion(value));
    }

    @Override
    public String toString() {
        if(getValue() == ONE) return "ONE";
        return "UNKNOWN";
    }

    public static class Array extends VulkanPipelineCacheHeaderVersion implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCacheHeaderVersion> {
        public Array(VkPipelineCacheHeaderVersion.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineCacheHeaderVersion.Array(count));
        }

        public Array(int count, VulkanPipelineCacheHeaderVersion o){
            this(new VkPipelineCacheHeaderVersion.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCacheHeaderVersion.Array getVk(){
            return (VkPipelineCacheHeaderVersion.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCacheHeaderVersion get(int i){
            return new VulkanPipelineCacheHeaderVersion(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineCacheHeaderVersion.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineCacheHeaderVersion.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineCacheHeaderVersion.Pointer(value));
        }

        @Override
        public VkPipelineCacheHeaderVersion.Pointer getVk(){
            return (VkPipelineCacheHeaderVersion.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineCacheHeaderVersion.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCacheHeaderVersion.Pointer> {
            public Array(int count) {
                super(new VkPipelineCacheHeaderVersion.Pointer.Array(count));
            }

            public Array(VulkanPipelineCacheHeaderVersion[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineCacheHeaderVersion.Pointer.Array getVk(){
                return (VkPipelineCacheHeaderVersion.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineCacheHeaderVersion.Pointer get(int i){
                return new VulkanPipelineCacheHeaderVersion.Pointer(getVk().get(i));
            }
        }
    }
}
