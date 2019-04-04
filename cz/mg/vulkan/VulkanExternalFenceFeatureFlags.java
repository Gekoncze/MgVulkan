package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalFenceFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanExternalFenceFeatureFlags extends VulkanFlags {
    public VulkanExternalFenceFeatureFlags(){
        super(new VkExternalFenceFeatureFlags());
    }

    public VulkanExternalFenceFeatureFlags(VkExternalFenceFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkExternalFenceFeatureFlags getVk(){
        return (VkExternalFenceFeatureFlags) super.getVk();
    }

    public VulkanExternalFenceFeatureFlags(int value){
        super(new VkExternalFenceFeatureFlags(value));
    }

    public static class Array extends VulkanExternalFenceFeatureFlags implements cz.mg.collections.array.ReadonlyArray<VulkanExternalFenceFeatureFlags> {
        public Array(VkExternalFenceFeatureFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalFenceFeatureFlags.Array(count));
        }

        public Array(int count, VulkanExternalFenceFeatureFlags o){
            this(new VkExternalFenceFeatureFlags.Array(count, o.getVk()));
        }

        @Override
        public VkExternalFenceFeatureFlags.Array getVk(){
            return (VkExternalFenceFeatureFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalFenceFeatureFlags get(int i){
            return new VulkanExternalFenceFeatureFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalFenceFeatureFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalFenceFeatureFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalFenceFeatureFlags.Pointer(value));
        }

        @Override
        public VkExternalFenceFeatureFlags.Pointer getVk(){
            return (VkExternalFenceFeatureFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalFenceFeatureFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalFenceFeatureFlags.Pointer> {
            public Array(int count) {
                super(new VkExternalFenceFeatureFlags.Pointer.Array(count));
            }

            public Array(VulkanExternalFenceFeatureFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalFenceFeatureFlags.Pointer.Array getVk(){
                return (VkExternalFenceFeatureFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalFenceFeatureFlags.Pointer get(int i){
                return new VulkanExternalFenceFeatureFlags.Pointer(getVk().get(i));
            }
        }
    }
}
