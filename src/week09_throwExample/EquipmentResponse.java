package week09_throwExample;

    public record EquipmentResponse(Long id, String name, int quantity) {
        public static EquipmentResponse from(Equipment equipment) {
            return new EquipmentResponse(
                    equipment.getId(),
                    equipment.getName(),
                    equipment.getQuantity());
        }
    }
