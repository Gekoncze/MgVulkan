package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubgroupFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanSubgroupFeatureFlags extends VulkanFlags {
    public VulkanSubgroupFeatureFlags(){
        super(new VkSubgroupFeatureFlags());
    }

    public VulkanSubgroupFeatureFlags(VkSubgroupFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkSubgroupFeatureFlags getVk(){
        return (VkSubgroupFeatureFlags) super.getVk();
    }

    public VulkanSubgroupFeatureFlags(int value){
        super(new VkSubgroupFeatureFlags(value));
    }

    public static class Array extends VulkanSubgroupFeatureFlags implements cz.mg.collections.array.ReadonlyArray<VulkanSubgroupFeatureFlags> {
        public Array(VkSubgroupFeatureFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSubgroupFeatureFlags.Array(count));
        }

        public Array(int count, VulkanSubgroupFeatureFlags o){
            this(new VkSubgroupFeatureFlags.Array(count, o.getVk()));
        }

        @Override
        public VkSubgroupFeatureFlags.Array getVk(){
            return (VkSubgroupFeatureFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSubgroupFeatureFlags get(int i){
            return new VulkanSubgroupFeatureFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSubgroupFeatureFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSubgroupFeatureFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkSubgroupFeatureFlags.Pointer(value));
        }

        @Override
        public VkSubgroupFeatureFlags.Pointer getVk(){
            return (VkSubgroupFeatureFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanSubgroupFeatureFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSubgroupFeatureFlags.Pointer> {
            public Array(int count) {
                super(new VkSubgroupFeatureFlags.Pointer.Array(count));
            }

            public Array(VulkanSubgroupFeatureFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSubgroupFeatureFlags.Pointer.Array getVk(){
                return (VkSubgroupFeatureFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSubgroupFeatureFlags.Pointer get(int i){
                return new VulkanSubgroupFeatureFlags.Pointer(getVk().get(i));
            }
        }
    }
}
