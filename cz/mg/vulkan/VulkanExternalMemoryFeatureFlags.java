package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryFeatureFlags extends VulkanFlags {
    public VulkanExternalMemoryFeatureFlags(){
        super(new VkExternalMemoryFeatureFlags());
    }

    public VulkanExternalMemoryFeatureFlags(VkExternalMemoryFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryFeatureFlags getVk(){
        return (VkExternalMemoryFeatureFlags) super.getVk();
    }

    public VulkanExternalMemoryFeatureFlags(int value){
        super(new VkExternalMemoryFeatureFlags(value));
    }

    public static class Array extends VulkanExternalMemoryFeatureFlags implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryFeatureFlags> {
        public Array(VkExternalMemoryFeatureFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryFeatureFlags.Array(count));
        }

        public Array(int count, VulkanExternalMemoryFeatureFlags o){
            this(new VkExternalMemoryFeatureFlags.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryFeatureFlags.Array getVk(){
            return (VkExternalMemoryFeatureFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryFeatureFlags get(int i){
            return new VulkanExternalMemoryFeatureFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryFeatureFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryFeatureFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryFeatureFlags.Pointer(value));
        }

        @Override
        public VkExternalMemoryFeatureFlags.Pointer getVk(){
            return (VkExternalMemoryFeatureFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryFeatureFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryFeatureFlags.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryFeatureFlags.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryFeatureFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryFeatureFlags.Pointer.Array getVk(){
                return (VkExternalMemoryFeatureFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryFeatureFlags.Pointer get(int i){
                return new VulkanExternalMemoryFeatureFlags.Pointer(getVk().get(i));
            }
        }
    }
}
