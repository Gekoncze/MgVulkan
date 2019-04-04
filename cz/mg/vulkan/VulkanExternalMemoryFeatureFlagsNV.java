package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryFeatureFlagsNV.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryFeatureFlagsNV extends VulkanFlags {
    public VulkanExternalMemoryFeatureFlagsNV(){
        super(new VkExternalMemoryFeatureFlagsNV());
    }

    public VulkanExternalMemoryFeatureFlagsNV(VkExternalMemoryFeatureFlagsNV vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryFeatureFlagsNV getVk(){
        return (VkExternalMemoryFeatureFlagsNV) super.getVk();
    }

    public VulkanExternalMemoryFeatureFlagsNV(int value){
        super(new VkExternalMemoryFeatureFlagsNV(value));
    }

    public static class Array extends VulkanExternalMemoryFeatureFlagsNV implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryFeatureFlagsNV> {
        public Array(VkExternalMemoryFeatureFlagsNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryFeatureFlagsNV.Array(count));
        }

        public Array(int count, VulkanExternalMemoryFeatureFlagsNV o){
            this(new VkExternalMemoryFeatureFlagsNV.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryFeatureFlagsNV.Array getVk(){
            return (VkExternalMemoryFeatureFlagsNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryFeatureFlagsNV get(int i){
            return new VulkanExternalMemoryFeatureFlagsNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryFeatureFlagsNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryFeatureFlagsNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryFeatureFlagsNV.Pointer(value));
        }

        @Override
        public VkExternalMemoryFeatureFlagsNV.Pointer getVk(){
            return (VkExternalMemoryFeatureFlagsNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryFeatureFlagsNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryFeatureFlagsNV.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryFeatureFlagsNV.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryFeatureFlagsNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryFeatureFlagsNV.Pointer.Array getVk(){
                return (VkExternalMemoryFeatureFlagsNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryFeatureFlagsNV.Pointer get(int i){
                return new VulkanExternalMemoryFeatureFlagsNV.Pointer(getVk().get(i));
            }
        }
    }
}
