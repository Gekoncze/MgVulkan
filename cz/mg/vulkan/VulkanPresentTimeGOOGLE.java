package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPresentTimeGOOGLE extends VulkanObject {
    public VulkanPresentTimeGOOGLE(){
        super(new VkPresentTimeGOOGLE());
    }

    public VulkanPresentTimeGOOGLE(VkPresentTimeGOOGLE vk){
        super(vk);
    }

    @Override
    public VkPresentTimeGOOGLE getVk(){
        return (VkPresentTimeGOOGLE) super.getVk();
    }

    public VulkanPresentTimeGOOGLE(VulkanUInt32 presentID, VulkanUInt64 desiredPresentTime) {
        super(new VkPresentTimeGOOGLE(presentID.getVk(), desiredPresentTime.getVk()));
    }

    public VulkanUInt32 getPresentID() {
        return new VulkanUInt32(getVk().getPresentID());
    }

    public void setPresentID(VulkanUInt32 presentID) {
        getVk().setPresentID(presentID.getVk());
    }

    public VulkanUInt64 getDesiredPresentTime() {
        return new VulkanUInt64(getVk().getDesiredPresentTime());
    }

    public void setDesiredPresentTime(VulkanUInt64 desiredPresentTime) {
        getVk().setDesiredPresentTime(desiredPresentTime.getVk());
    }


    public static class Array extends VulkanPresentTimeGOOGLE implements cz.mg.collections.array.ReadonlyArray<VulkanPresentTimeGOOGLE> {
        public Array(VkPresentTimeGOOGLE.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPresentTimeGOOGLE.Array(count));
        }

        public Array(int count, VulkanPresentTimeGOOGLE o){
            this(new VkPresentTimeGOOGLE.Array(count, o.getVk()));
        }

        @Override
        public VkPresentTimeGOOGLE.Array getVk(){
            return (VkPresentTimeGOOGLE.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPresentTimeGOOGLE get(int i){
            return new VulkanPresentTimeGOOGLE(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPresentTimeGOOGLE.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPresentTimeGOOGLE.Pointer());
        }

        public Pointer(long value) {
            this(new VkPresentTimeGOOGLE.Pointer(value));
        }

        @Override
        public VkPresentTimeGOOGLE.Pointer getVk(){
            return (VkPresentTimeGOOGLE.Pointer) super.getVk();
        }

        public static class Array extends VulkanPresentTimeGOOGLE.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPresentTimeGOOGLE.Pointer> {
            public Array(int count) {
                super(new VkPresentTimeGOOGLE.Pointer.Array(count));
            }

            public Array(VulkanPresentTimeGOOGLE[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPresentTimeGOOGLE.Pointer.Array getVk(){
                return (VkPresentTimeGOOGLE.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPresentTimeGOOGLE.Pointer get(int i){
                return new VulkanPresentTimeGOOGLE.Pointer(getVk().get(i));
            }
        }
    }
}
